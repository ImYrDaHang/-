package com.imyrdahangBlogger.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imyrdahang.common.utils.CookieUtils;
import com.imyrdahang.common.utils.JsonUtils;
import com.imyrdahang.pojo.Articles;
import com.imyrdahang.pojo.Configs;
import com.imyrdahang.pojo.MergeArticle;
import com.imyrdahang.pojo.Models;
import com.imyrdahang.pojo.Users;
import com.imyrdahangBlogger.collection.ReadCollection;
import com.imyrdahangBlogger.service.interfaces.ArticleService;
import com.imyrdahangBlogger.service.interfaces.ConfigService;
import com.imyrdahangBlogger.service.interfaces.ModelService;
import com.imyrdahangBlogger.service.interfaces.UserService;

@Controller
public class ContentController {
	private static final Logger logger=LoggerFactory.getLogger(ContentController.class);
	@Value("${ARTICLE_COOKIE_IDLIST}")
	private String ARTICLE_COOKIE_IDLIST;
	@Value("${ARTICLE_COOKIE_IDLIST_COOKIEMAXAGE}")
	private int ARTICLE_COOKIE_IDLIST_COOKIEMAXAGE;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private ConfigService configService;
	@Autowired
	private ModelService modelService;
	@Autowired
	private ReadCollection readCollection;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/content/{aId}")
	public String content(@PathVariable int aId,Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		//获取文章详情
		MergeArticle mainArticle = articleService.selectMergeArticleByPrimaryKey(aId);
		model.addAttribute("mainArticle", mainArticle);
		//用户信息
		Users user=userService.selectUserByPrimarykey(mainArticle.getArticles().getaUId());
		model.addAttribute("user", user);
		int aMId=mainArticle.getArticles().getaMId();
		//文章位置信息
		Models seedModels = modelService.selectModelByMId(aMId);
		Models fatherModels = modelService.selectModelByMId(seedModels.getmFId());
		model.addAttribute("seedModels", seedModels);
		model.addAttribute("fatherModels", fatherModels);
		//获取上下篇
		List<Articles> UpAndDownArticles = articleService.selectArticleByUpAndDownPiece(aMId, aId);
		if(UpAndDownArticles.size()>1){
			model.addAttribute("UpArticle", UpAndDownArticles.get(1));
			model.addAttribute("DownArticle", UpAndDownArticles.get(0));
		}else if(UpAndDownArticles.size()==1){
			Articles UpAndDownArticle = UpAndDownArticles.get(0);
			if(UpAndDownArticle.getaUpdateDate().before(mainArticle.getArticles().getaUpdateDate()))
				model.addAttribute("UpArticle", UpAndDownArticle);
			else model.addAttribute("DownArticle", UpAndDownArticle);
		}
		//获取相关文章
		//获取显示条数控制
		List<Configs> CONTENT_CONFIG = configService.selectConfigByCode("CONTENT", "CONTENT_CONFIG");
		int timerRows=10;
		if(CONTENT_CONFIG!=null&&CONTENT_CONFIG.size()>0){
			timerRows=Integer.valueOf(CONTENT_CONFIG.get(0).getcData1());
		}
		List<Articles> correlationArticles = articleService.selectArticlesByAMIdAndPageAndSortField(aMId, 1, timerRows, "a_hits desc");
		model.addAttribute("correlationArticles", correlationArticles);
		try {
			//增加点击量
			cookieArticleId(aId, request, response);
		} catch (Exception e) {
			logger.error("调用点击量增加出错,时间："+new Date().toString(),e);
		}
		return "content";
	}
	//点击量是否增加
	private void cookieArticleId(Integer bowenid,HttpServletRequest request,HttpServletResponse response)throws Exception{
		String json = CookieUtils.getCookieValue(request, ARTICLE_COOKIE_IDLIST);
		List<Integer> list=new ArrayList<Integer>();
		if(StringUtils.isNotBlank(json)){
			list = JsonUtils.jsonToList(json,Integer.class);
			if(list.contains(bowenid)){
				return;
			}
		}
		readCollection.readUp(bowenid);
		list.add(bowenid);
		//这里的为半小时
		CookieUtils.setCookie(request, response, ARTICLE_COOKIE_IDLIST, JsonUtils.objectToJson(list), ARTICLE_COOKIE_IDLIST_COOKIEMAXAGE);
	}
}
