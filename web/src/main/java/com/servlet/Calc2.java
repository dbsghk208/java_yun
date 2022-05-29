package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/calc2")
public class Calc2 extends HttpServlet {


	protected void service(HttpServletRequest request,HttpServlet response) throws ServletException, IOException {
			
			response.setContentType("text/html; charset=UTF-8");
			
			String x_ = request.getParameter("x");
			String y_ = request.getParameter("y");
			String op = request.getParameter("operator");
			
			int x = 0;
			int y = 0;
			
			if(!x_.equals("")) x = Integer.parseInt(x_);
			if(!y_.equals("")) y = Integer.parseInt(y_);
			
			int reault = 0;
			
			if(op.equals("����"))
					result = x+y;
			else
					result = x-y;
			
			response.getWriter().printf("result is %d\n", result); 
			
	}

	
}
