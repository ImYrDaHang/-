package com.imyrdahangManager.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.common.utils.CommonUtils;
import com.imyrdahang.common.utils.pageResult;
import com.imyrdahang.pojo.ArticleContents;
import com.imyrdahang.pojo.Articles;
import com.imyrdahang.pojo.MergeArticle;
import com.imyrdahang.pojo.Models;
import com.imyrdahang.pojo.Users;
import com.imyrdahangManager.service.interfaces.ArticleService;
import com.imyrdahangManager.service.interfaces.ModelService;
import com.imyrdahangManager.service.interfaces.UserService;

@Controller
public class ArticleController {
	@Value("${PAGE_NUM}")
	private Integer PAGE_NUM;
	@Autowired
	private ModelService modelService;
	@Autowired 
	private ArticleService articleService;
	@Autowired
	private UserService userService;
	//首页
	@RequestMapping("/article")
	public String article(@RequestParam(defaultValue="1") int pages,Model model) throws Exception{
		List<Articles> list = articleService.selectArticles(pages, PAGE_NUM);
		//aUId转成名称
		CommonUtils.articlesOfUIdShiftUNamePutExt1(list,userService.selectUsers());
		//aMId转成名称
		CommonUtils.articlesOfMIdShiftMNamePutExt2(list, modelService.selectModels());
		int count = articleService.selectArticlesCount();
		pageResult result=new pageResult();
		result.setDate(list);
		result.setPage(pages);
		result.setPages(count/PAGE_NUM+(count%PAGE_NUM==0?0:1));
		result.setSum(count);
		model.addAttribute("pagingArticles", result);
		return "article";
	}
	//跳转添加文章页面
	@RequestMapping("/article/add")
	public String addArticlePage(Model model) throws Exception{
		List<Models> models = modelService.selectModels();
		List<Models> heelModels = new ArrayList<Models>();
		List<Models> seedModels = new ArrayList<Models>();
		for(Models m:models){
			if(m.getmFId()==0) heelModels.add(m);
			else seedModels.add(m);
		}
		for(Models m:seedModels){
			for(Models heelModel:heelModels){
				if(m.getmFId()==heelModel.getmId()){
					m.setExt1(heelModel.getmName());
					break;
				}
			}
		}
		model.addAttribute("models", seedModels);
		return "add-article";
	}
	//添加文章
	@RequestMapping("/article/add/yes")
	@ResponseBody
	public TaotaoResult addArticle(HttpSession session,ArticleContents articleContent,Articles article) throws Exception{
		Users user = (Users)session.getAttribute("user");
		//设置用户ID
		article.setaUId(user.getuId());
		TaotaoResult result = articleService.saveArticle(articleContent, article);
		//修改模块下的文章数
		modelService.updateMASumByMId(article.getaMId());
		return result;
	}
	//跳转修改文章页面
	@RequestMapping("/article/update/{aId}")
	public String updateAritclePage(@PathVariable Integer aId,Model model) throws Exception{
		//修改的文章数据·
		MergeArticle mergeArticle = articleService.selectMergeArticleByPrimaryKey(aId);
		model.addAttribute("mergeArticle", mergeArticle);
		//模块选择数据
		List<Models> models = modelService.selectModels();
		List<Models> heelModels = new ArrayList<Models>();
		List<Models> seedModels = new ArrayList<Models>();
		for(Models m:models){
			if(m.getmFId()==0) heelModels.add(m);
			else seedModels.add(m);
		}
		for(Models m:seedModels){
			for(Models heelModel:heelModels){
				if(m.getmFId()==heelModel.getmId()){
					m.setExt1(heelModel.getmName());
					break;
				}
			}
		}
		model.addAttribute("models", seedModels);
		return "update-article";
	}
	//修改文章
	@RequestMapping("/article/update/yes")
	@ResponseBody
	public TaotaoResult updateAritcle(ArticleContents articleContent,Articles article,HttpSession session) throws Exception{
		Users user = (Users)session.getAttribute("user");
		//updateFlinkByPrimaryKey里判断是否用户ID一致
		return articleService.updateMergeArticleByPrimaryKey(articleContent, article, user.getuId());
	}
	//删除文章
	@RequestMapping("/article/delete/{aId}")
	@ResponseBody
	public TaotaoResult deleteAritcle(@PathVariable Integer aId,HttpSession session) throws Exception{
		Users user = (Users)session.getAttribute("user");
		//deleteFlinkByPrimaryKey里判断是否用户ID一致
		return articleService.deleteMergeArticleByPrimaryKey(aId, user.getuId());
	}
}
