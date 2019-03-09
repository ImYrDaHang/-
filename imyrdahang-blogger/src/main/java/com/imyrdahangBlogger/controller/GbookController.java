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
public class GbookController {
	@Value("${GBOOK_MID}")
	private Integer GBOOK_MID;
	@Autowired
	private ConfigService configService;
	@Autowired
	private ModelService modelService;
	//留言页面
	@RequestMapping(value={"/gbook","/position/19"})
	public String gbook(Model model)throws Exception{
		List<Configs> GBOOK_CTITLES = configService.selectConfigByCode("GBOOK", "GBOOK_CTITLES");
		if(GBOOK_CTITLES!=null&&GBOOK_CTITLES.size()>0)
			model.addAttribute("learnCtitle", GBOOK_CTITLES.get(0));
		//栏目信息
		Models modelData = modelService.selectModelByMId(GBOOK_MID);
		model.addAttribute("modelData", modelData);
		return "gbook";
	}
}
