package com.imyrdahangBlogger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imyrdahang.pojo.Configs;
import com.imyrdahang.pojo.Models;
import com.imyrdahangBlogger.service.interfaces.ConfigService;
import com.imyrdahangBlogger.service.interfaces.ModelService;

@Controller
public class AboutController {
	@Value("${ABOUT_MID}")
	private Integer ABOUT_MID;
	@Value("${ABOUT_AXLE_SORT_TERM}")
	private String ABOUT_AXLE_SORT_TERM;
	@Autowired
	private ModelService modelService;
	@Autowired
	private ConfigService configService;
	//关于我页面
	@RequestMapping(value={"/about","/position/15"})
	public String about(Model model)throws Exception{
		//栏目信息
		Models modelData = modelService.selectModelByMId(ABOUT_MID);
		model.addAttribute("modelData", modelData);
		//图片里的三条
		List<Configs> ABOUT_BANNER = configService.selectConfigByCode("ABOUT", "ABOUT_BANNER");
		model.addAttribute("aboutBanner", ABOUT_BANNER.get(0));
		//自我介绍
		List<Configs> ABOUT = configService.selectConfigByCode("ABOUT", "ABOUT");
		model.addAttribute("about", ABOUT.get(0));
		//配置
		List<Configs> ABOUT_STATE = configService.selectConfigByCode("ABOUT", "ABOUT_STATE");
		model.addAttribute("aboutState", ABOUT_STATE.get(0));
		//入行时间轴
		List<Configs> ABOUT_TIME = configService.selectConfigBySortCode("ABOUT", "ABOUT_TIME", ABOUT_AXLE_SORT_TERM+" asc");
		model.addAttribute("aboutTime", ABOUT_TIME);
		return "about";
	}
}
