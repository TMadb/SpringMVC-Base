package com.org.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;

public class MyOneController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		//将msg存储到request中
		mv.addObject("msg", "SpringMVCOneTest");
		//采用setViewName实现请求转发
		mv.setViewName("/successful.jsp");
		return mv;		
		
	}
 
}
