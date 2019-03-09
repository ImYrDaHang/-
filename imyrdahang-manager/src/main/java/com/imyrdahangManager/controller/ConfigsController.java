package com.imyrdahangManager.controller;

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
import com.imyrdahang.common.utils.pageResult;
import com.imyrdahang.pojo.Configs;
import com.imyrdahang.pojo.Users;
import com.imyrdahangManager.service.interfaces.ConfigService;

@Controller
public class ConfigsController {
	@Value("${PAGE_NUM}")
	private Integer PAGE_NUM;
	@Autowired
	private ConfigService configService;
	//缓存配置首页
	@RequestMapping("/configs")
	public String configs(@RequestParam(defaultValue="1") int pages,Model model) throws Exception{
		List<Configs> list = configService.selectConfigs(pages, PAGE_NUM);
		int count = configService.selectConfigsCount();
		pageResult result=new pageResult();
		result.setDate(list);
		result.setPage(pages);
		result.setPages(count/7+(count%7==0?0:1));
		result.setSum(count);
		model.addAttribute("pagingConfigs", result);
		return "configs";
	}
	//跳转添加缓存配置页面
	@RequestMapping("/configs/add")
	public String addConfigsPage(){
		return "add-configs";
	}
	//添加配置、
	@RequestMapping("/configs/add/yes")
	@ResponseBody
	public TaotaoResult addConfigs(Configs configs,HttpSession session) throws Exception{
		Users user = (Users)session.getAttribute("user");
		configs.setcUId(user.getuId());
		return configService.saveConfig(configs);
	}
	//跳转修改页面
	@RequestMapping("/configs/update/{cId}")
	public String updateConfigPage(@PathVariable Integer cId,Model model)throws Exception{
		Configs configs = configService.selectConfigByPrimaryKey(cId);
		model.addAttribute("configs", configs);
		return "update-configs";
	}
	//修改
	@RequestMapping("/configs/update/yes")
	@ResponseBody
	public TaotaoResult updateConfig(Configs config,HttpSession session)throws Exception{
		Users user = (Users)session.getAttribute("user");
		//deleteFlinkByPrimaryKey里判断是否用户ID一致
		return configService.updateConfigByPrimaryKey(config, user.getuId());
	}
	//删除
	@RequestMapping("/configs/delete/{cId}")
	@ResponseBody
	public TaotaoResult deleteConfig(@PathVariable Integer cId,HttpSession session)throws Exception{
		Users user = (Users)session.getAttribute("user");
		//deleteFlinkByPrimaryKey里判断是否用户ID一致
		return configService.deleteConfigByPrimaryKey(cId, user.getuId());
	}
	
}
