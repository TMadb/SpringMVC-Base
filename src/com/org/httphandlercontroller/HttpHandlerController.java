package com.org.httphandlercontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class HttpHandlerController implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//使用原生的Servlet
		request.setAttribute("msg", "HttpRequestHandlerTest");	
		request.getRequestDispatcher("/successful.jsp").forward(request, response);
	}

}
