package com.imyrdahangBlogger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imyrdahang.common.utils.CommonUtils;
import com.imyrdahang.pojo.Articles;
import com.imyrdahang.pojo.Configs;
import com.imyrdahang.pojo.Models;
import com.imyrdahangBlogger.service.interfaces.ArticleService;
import com.imyrdahangBlogger.service.interfaces.ConfigService;
import com.imyrdahangBlogger.service.interfaces.ModelService;
import com.imyrdahangBlogger.service.interfaces.UserService;

@Controller
public class IndexController {
	@Value("${INDEX_MID}")
	private Integer INDEX_MID;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private ConfigService configService;
	@Autowired
	private UserService userService;
	@Autowired
	private ModelService modelService;
	@RequestMapping("/error/404")
	public String error404(){
		return "error/404";
	}
	@RequestMapping("/error/500")
	public String error500(){
		return "error/500";
	}
	//首页
	@RequestMapping(value={"/index","/position/14"})
	public String index(Model model) throws Exception{
		//栏目信息
		Models modelData = modelService.selectModelByMId(INDEX_MID);
		model.addAttribute("modelData", modelData);
		//获取显示条数控制
		List<Configs> configs = configService.selectConfigByCode("PAGE", "PAGE_ROWS");
		int timerRows=10,recommendRows=3;
		if(configs!=null&&configs.size()>0){
			timerRows=Integer.valueOf(configs.get(0).getcData1());
			recommendRows=Integer.valueOf(configs.get(0).getcData5());
		}
		//时间轴部分数据
		List<Articles> timerList = articleService.selectArticlesBySortField(1, timerRows,"a_update_date desc");
		//aUId转成名称
		CommonUtils.articlesOfUIdShiftUNamePutExt1(timerList,userService.selectUsers());
		//aMId转成名称
		CommonUtils.articlesOfMIdShiftMNamePutExt2(timerList, modelService.selectModels());
		model.addAttribute("timerArticles", timerList);
		//推荐部分，推荐的条数不是固定的三条，可以设置
		List<Articles> recommendList = articleService.selectArticlesBySortField(1,recommendRows,"a_state desc,a_hits desc");
		model.addAttribute("recommendArticles", recommendList);
		return "index";
	}
	@RequestMapping("/seed/model/page/{aMId}")
	public String seedModelTypePage(@PathVariable int aMId)throws Exception{
		Models model = modelService.selectFatherModelByaMId(aMId);
		if(model==null) return "redirect:/index.html";
		return "redirect:/position/"+modelService.selectFatherModelByaMId(aMId).getmId()+".html?aMId="+aMId;
	}
}
