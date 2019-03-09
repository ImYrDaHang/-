package com.imyrdahangBlogger.error;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ErrorChuLi implements HandlerExceptionResolver {
	//导入的是slf4j包的
	private static final Logger logger=LoggerFactory.getLogger(ErrorChuLi.class);
	@Override
	public ModelAndView resolveException(HttpServletRequest request, 
			HttpServletResponse response, Object handler,
			Exception e) {
		//打印到控制台
		e.printStackTrace();
		//写入日志文件
		logger.error("系统发生错误", e);
		//给用户友好的页面提示
		ModelAndView modeAndView=new ModelAndView();
		//modeAndView.addObject("message", "你的电脑废了，换一台吧！");
		modeAndView.setViewName("error/500");
		return modeAndView;
	}

}
