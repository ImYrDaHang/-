package com.imyrdahangBlogger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imyrdahang.common.utils.CommonUtils;
import com.imyrdahang.common.utils.pageResult;
import com.imyrdahang.pojo.Articles;
import com.imyrdahang.pojo.Configs;
import com.imyrdahang.pojo.Models;
import com.imyrdahangBlogger.service.interfaces.ArticleService;
import com.imyrdahangBlogger.service.interfaces.ConfigService;
import com.imyrdahangBlogger.service.interfaces.ModelService;
import com.imyrdahangBlogger.service.interfaces.UserService;

@Controller
public class LearnController {
	@Value("${LEARN_MID}")
	private Integer LEARN_MID;
	@Value("${LEARN_AXLE_SORT_TERM}")
	private String LEARN_AXLE_SORT_TERM;
	@Autowired
	private ConfigService configService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private UserService userService;
	@Autowired
	private ModelService modelService;
	//学无止境页面
	@RequestMapping(value={"/learn","/position/18"})
	public String learn(@RequestParam(defaultValue="0") int aMId,@RequestParam(defaultValue="1") int pages,Model model)throws Exception{
		//获取显示条数控制
		List<Configs> configs = configService.selectConfigByCode("PAGE", "PAGE_ROWS");
		int timerRows=10;
		if(configs!=null&&configs.size()>0){
			timerRows=Integer.valueOf(configs.get(0).getcData4());
		}
		//标题旁的一句话
		List<Configs> LEARN_CTITLE = configService.selectConfigByCode("LEARN", "LEARN_CTITLE");
		if(LEARN_CTITLE!=null&&LEARN_CTITLE.size()>0)
			model.addAttribute("learnCtitle", LEARN_CTITLE.get(0));
		//子模块数据
		List<Models> models = modelService.selectModelsByMFId(LEARN_MID);
		model.addAttribute("learnModels", models);
		//时间轴内容
		List<Articles> articleList;
		int count;
		Models modelData;
		if(aMId==0||aMId==LEARN_MID){
			articleList = articleService.selectArticlesByRootMIdAndPageAndSortField(LEARN_MID, pages, timerRows, LEARN_AXLE_SORT_TERM+" desc");
			count = articleService.selectArticleCountByRootMId(LEARN_MID);
			modelData = modelService.selectModelByMId(LEARN_MID);
		}else{
			articleList = articleService.selectArticlesByAMIdAndPageAndSortField(aMId, pages, timerRows, LEARN_AXLE_SORT_TERM+" desc");
			count = articleService.selectArticleCountByAMId(aMId);
			modelData = modelService.selectModelByMId(aMId);
		}
		//aUId转成名称
		CommonUtils.articlesOfUIdShiftUNamePutExt1(articleList,userService.selectUsers());
		//aMId转成名称
		CommonUtils.articlesOfMIdShiftMNamePutExt2(articleList, modelService.selectModels());
		//文章条数
		pageResult result=new pageResult();
		result.setDate(articleList);
		result.setPage(pages);
		result.setPages(count/timerRows+(count%timerRows==0?0:1));
		result.setSum(count);
		model.addAttribute("pageResult", result);
		//栏目信息
		model.addAttribute("modelData", modelData);
		return "learn";
	}
}
