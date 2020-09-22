package com.org.multiactioncontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class MultiActionControllerTest extends MultiActionController {

	public ModelAndView testOne(HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "MultiActionControllerTestOne");
		mv.setViewName("/successful.jsp");
		return mv;	
	}
	public ModelAndView testTwo(HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "MultiActionControllerTesTwo");
		mv.setViewName("/successful.jsp");
		return mv;	
	}
	public ModelAndView testThree(HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "MultiActionControllerTestThree");
		mv.setViewName("/successful.jsp");
		return mv;		
	}
	
}
