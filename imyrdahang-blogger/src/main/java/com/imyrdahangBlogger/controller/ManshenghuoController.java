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
public class ManshenghuoController {
	@Value("${MANSHENGHUO_MID}")
	private Integer MANSHENGHUO_MID;
	@Value("${MANSHENGHUO_AXLE_SORT_TERM}")
	private String MANSHENGHUO_AXLE_SORT_TERM;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private ConfigService configService;
	@Autowired
	private UserService userService;
	@Autowired
	private ModelService modelService;
	//慢生活页面
	//首页
	@RequestMapping(value={"/manshenghuo","/position/16"})
	public String manshenghuo(@RequestParam(defaultValue="1") int pages,Model model)throws Exception{
		//栏目信息
		Models modelData = modelService.selectModelByMId(MANSHENGHUO_MID);
		model.addAttribute("modelData", modelData);
		//获取显示条数控制
		List<Configs> configs = configService.selectConfigByCode("PAGE", "PAGE_ROWS");
		int timerRows=10;
		if(configs!=null&&configs.size()>0){
			timerRows=Integer.valueOf(configs.get(0).getcData2());
		}
		//慢生活标题旁的一句话
		List<Configs> MANSHENGHUO_CTITLE = configService.selectConfigByCode("MANSHENGHUO", "MANSHENGHUO_CTITLE");
		if(MANSHENGHUO_CTITLE!=null&&MANSHENGHUO_CTITLE.size()>0)
			model.addAttribute("manshenghuoCtitle", MANSHENGHUO_CTITLE.get(0));
		//时间轴内容
		List<Articles> articleList = articleService.selectArticlesByRootMIdAndPageAndSortField(MANSHENGHUO_MID, pages, timerRows, MANSHENGHUO_AXLE_SORT_TERM+" desc");
		//aUId转成名称
		CommonUtils.articlesOfUIdShiftUNamePutExt1(articleList,userService.selectUsers());
		//aMId转成名称
		CommonUtils.articlesOfMIdShiftMNamePutExt2(articleList, modelService.selectModels());
		//文章条数
		int count = articleService.selectArticleCountByRootMId(MANSHENGHUO_MID);
		pageResult result=new pageResult();
		result.setDate(articleList);
		result.setPage(pages);
		result.setPages(count/timerRows+(count%timerRows==0?0:1));
		result.setSum(count);
		model.addAttribute("pageResult", result);
		return "manshenghuo";
	}
}
