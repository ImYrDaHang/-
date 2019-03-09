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
import com.imyrdahang.common.utils.CommonUtils;
import com.imyrdahang.common.utils.pageResult;
import com.imyrdahang.pojo.Enshrines;
import com.imyrdahang.pojo.Users;
import com.imyrdahangManager.service.interfaces.FlinkService;
import com.imyrdahangManager.service.interfaces.UserService;

@Controller
public class FlinkController {
	@Value("${PAGE_NUM}")
	private Integer PAGE_NUM;
	@Autowired
	private FlinkService flinkService;
	@Autowired
	private UserService userService;
	//首页
	@RequestMapping("/flink")
	public String flink(@RequestParam(defaultValue="1") int pages,Model model) throws Exception{
		List<Enshrines> list = flinkService.selectFlinks(pages, PAGE_NUM);
		//aUId转成名称
		CommonUtils.enshrinesOfUIdShiftUNamePutExt1(list,userService.selectUsers());
		int count = flinkService.selectFlinksCount();
		pageResult result=new pageResult();
		result.setDate(list);
		result.setPage(pages);
		result.setPages(count/PAGE_NUM+(count%PAGE_NUM==0?0:1));
		result.setSum(count);
		model.addAttribute("pagingEnshrines", result);
		return "flink";
	}
	//跳转添加链接页面
	@RequestMapping("/flink/add")
	public String addFlinkPage(){
		return "add-flink";
	}
	//添加链接
	@RequestMapping("/flink/add/yes")
	@ResponseBody
	public TaotaoResult addFlink(Enshrines enshrine,HttpSession session)throws Exception{
		Users user = (Users)session.getAttribute("user");
		//添加用户ID
		enshrine.seteUId(user.getuId());
		return flinkService.saveFlink(enshrine);
	}
	//跳转到修改页面
	@RequestMapping("/flink/update/{eId}")
	public String updateFlinkPage(@PathVariable Integer eId,Model model) throws Exception{
		Enshrines enshrines = flinkService.selectFlinkByPrimaryKey(eId);
		model.addAttribute("enshrine", enshrines);
		return "update-flink";
	}
	//修改链接
	@RequestMapping("/flink/update/yes")
	@ResponseBody
	public TaotaoResult updateFlink(Enshrines enshrine,HttpSession session) throws Exception{
		Users user = (Users)session.getAttribute("user");
		//updateFlinkByPrimaryKey里判断是否用户ID一致
		return flinkService.updateFlinkByPrimaryKey(enshrine,user.getuId());
	}
	//删除链接
	@RequestMapping("/flink/delete/{eId}")
	@ResponseBody
	public TaotaoResult deleteFlink(@PathVariable Integer eId,HttpSession session) throws Exception{
		Users user = (Users)session.getAttribute("user");
		//deleteFlinkByPrimaryKey里判断是否用户ID一致
		return flinkService.deleteFlinkByPrimaryKey(eId,user.getuId());
	}
	
}
