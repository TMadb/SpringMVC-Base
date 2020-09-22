package com.org.annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class MultiActionControllerTest{
    
//	@RequestMapping("/one.do")
	public ModelAndView testOne(HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "MultiActionControllerTestOne");
		mv.setViewName("/successful.jsp");
		return mv;	
	}
	
//	@RequestMapping("/two.do")
	public ModelAndView testTwo(HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "MultiActionControllerTesTwo");
		mv.setViewName("/successful.jsp");
		return mv;	
	}
	
//	@RequestMapping("/three.do")
	public ModelAndView testThree(HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "MultiActionControllerTestThree");
		mv.setViewName("/successful.jsp");
		return mv;		
	}
	
}
