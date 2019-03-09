package com.imyrdahangManager.controller;


import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.pojo.Users;
import com.imyrdahangManager.service.interfaces.ArticleService;
import com.imyrdahangManager.service.interfaces.FlinkService;
import com.imyrdahangManager.service.interfaces.UserService;

@Controller
public class AdminController {
	@Autowired
	private UserService userService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private FlinkService flinkService;
	//400,404,503处理
	@RequestMapping("/error/404")
	public String error404(){
		return "error/404";
	}
	@RequestMapping("/error/500")
	public String error500(){
		return "error/500";
	}
	@RequestMapping(value={"/","/index"})
	public String index(HttpSession session,Model model) throws Exception{
		//总文章数
		model.addAttribute("articls", articleService.selectArticlesCount());
		//总链接数
		model.addAttribute("flinks", flinkService.selectFlinksCount());
		//用户对应的数据table
		List<Users> users = userService.selectUsers();
		for(Users user:users){
			//ext1放所属文章数
			user.setExt1(String.valueOf(articleService.selectArticlesCountByUId(user.getuId())));
			//ext2放所属链接数
			user.setExt2(String.valueOf(flinkService.selectFlinsCountByUId(user.getuId())));
			//清空对应数据
			user.setuAccount(null);
			user.setuPassword(null);
		}
		model.addAttribute("users", users);
		return "index";
	}
	@RequestMapping("/{page}")
	public String page(@PathVariable String page){
		return page;
	}
	@RequestMapping("/login/go")
	@ResponseBody
	public TaotaoResult login(String username,String pwd,HttpSession session,HttpServletRequest request) throws Exception{
		System.out.println(username+"=="+pwd);
		Users user = userService.login(username, pwd);
		if(user==null){
			return TaotaoResult.build(500, "用户名或密码错误");
		}
		user.setuPassword(null);
		session.setAttribute("user", user);
		//刷新用户登录时间和IP
		Users u=new Users();
		u.setLoginDate(new Date());
		u.setLoginIp(getIpAddr(request));
		u.setuId(user.getuId());
		userService.loginFlushDateAndIp(u);
		return TaotaoResult.ok();
		
	}
	@RequestMapping("/login/out")
	public String loginout(HttpSession session){
		session.removeAttribute("user");
		return "/login";
	}
	//获取用户的真实IP（而不是代理的）
	private String getIpAddr(HttpServletRequest request) {  
		String ip = request.getHeader("x-forwarded-for");   
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	      ip = request.getHeader("Proxy-Client-IP");   
	    }   
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	      ip = request.getHeader("WL-Proxy-Client-IP");   
	    }   
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	      ip = request.getHeader("HTTP_CLIENT_IP");   
	    }   
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	      ip = request.getHeader("HTTP_X_FORWARDED_FOR");   
	    }   
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {   
	      ip = request.getRemoteAddr();   
	    }   
	    return ip;  
	} 
}
