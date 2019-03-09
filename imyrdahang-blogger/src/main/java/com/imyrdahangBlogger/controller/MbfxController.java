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
import com.imyrdahang.pojo.Configs;
import com.imyrdahang.pojo.Enshrines;
import com.imyrdahang.pojo.Models;
import com.imyrdahangBlogger.service.interfaces.ConfigService;
import com.imyrdahangBlogger.service.interfaces.MbfxService;
import com.imyrdahangBlogger.service.interfaces.ModelService;
import com.imyrdahangBlogger.service.interfaces.UserService;

@Controller
public class MbfxController {
	@Value("${MBFX_MID}")
	private Integer MBFX_MID;
	@Value("${MBFX_AXLE_SORT_TERM}")
	private String MBFX_AXLE_SORT_TERM;
	@Autowired
	private ConfigService configService;
	@Autowired
	private UserService userService;
	@Autowired
	private ModelService modelService;
	@Autowired
	private MbfxService mbfxService;
	//我的收藏页面
	@RequestMapping(value={"/mbfx","/position/17"})
	public String mbfx(@RequestParam(defaultValue="1") int pages,Model model)throws Exception{
		//栏目信息
		Models modelData = modelService.selectModelByMId(MBFX_MID);
		model.addAttribute("modelData", modelData);
		//获取显示条数控制
		List<Configs> configs = configService.selectConfigByCode("PAGE", "PAGE_ROWS");
		int timerRows=10;
		if(configs!=null&&configs.size()>0){
			timerRows=Integer.valueOf(configs.get(0).getcData3());
		}
		//标题旁的一句话
		List<Configs> MANSHENGHUO_CTITLE = configService.selectConfigByCode("MBFX", "MBFX_CTITLE");
		if(MANSHENGHUO_CTITLE!=null&&MANSHENGHUO_CTITLE.size()>0)
			model.addAttribute("manshenghuoCtitle", MANSHENGHUO_CTITLE.get(0));
		//时间轴内容
		List<Enshrines> enshrinesList = mbfxService.selectEnshrinesByPageAndSortField(pages, timerRows, MBFX_AXLE_SORT_TERM+" desc");
		//aUId转成名称
		CommonUtils.enshrinesOfUIdShiftUNamePutExt1(enshrinesList,userService.selectUsers());
		//文章条数
		int count = mbfxService.selectEnshrineCount();
		pageResult result=new pageResult();
		result.setDate(enshrinesList);
		result.setPage(pages);
		result.setPages(count/timerRows+(count%timerRows==0?0:1));
		result.setSum(count);
		model.addAttribute("pageResult", result);
		return "mbfx";
	}
}
