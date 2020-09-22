package com.org.abstractcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class AbstractControllerTest extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		//将msg存储到request中
		mv.addObject("msg", "AbstractControllerTest");
		//采用setViewName实现请求转发
		mv.setViewName("/successful.jsp");
		return mv;
	}

}
