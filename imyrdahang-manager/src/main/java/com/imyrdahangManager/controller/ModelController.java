package com.imyrdahangManager.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.pojo.Models;
import com.imyrdahang.pojo.Users;
import com.imyrdahangManager.service.interfaces.ModelService;

@Controller
public class ModelController {
	@Autowired
	private ModelService modelService;
	//页面
	@RequestMapping("/category")
	public String models(Model model)throws Exception{
		//显示全部模块
		List<Models> list=modelService.selectModels();
		model.addAttribute("models", list);
		//添加时的模块选择
		List<Models> optionList=new ArrayList<Models>();
		for(Models m:list){
			if(m.getmFId()==0) optionList.add(m);
		}
		model.addAttribute("optionModels", optionList);
		return "category";
	}
	//添加栏目
	@RequestMapping("/model/save")
	@ResponseBody
	public TaotaoResult saveModels(Models models,HttpSession session) throws Exception{
		Users user = (Users)session.getAttribute("user");
		//设置用户ID
		models.setmUId(user.getuId());
		return modelService.saveModel(models);
	}
	//跳转修改栏目页面
	@RequestMapping("/model/update/{mId}")
	public String updateModelPage(@PathVariable Integer mId,Model model)throws Exception{
		//查询需要修改的模块数据
		Models models = modelService.selectModelByMId(mId);
		model.addAttribute("model", models);
		//查询可选的父模块数据
		List<Models> list = modelService.selectModelsByMFId(0);
		model.addAttribute("fuModels", list);
		return "update-category";
	}
	//修改栏目/
	@RequestMapping("/model/update/yes")
	@ResponseBody
	public TaotaoResult updateModel(Models models) throws Exception{
		return modelService.updateModelByMId(models);
	}
}
