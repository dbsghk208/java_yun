package com.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/calc2")
public class Calc3 extends HttpServlet {


	protected void service(HttpServletRequest request,HttpServlet response) throws ServletException, IOException {
			
			response.setContentType("text/html; charset=UTF-8");
			
			String v_ = request.getParameter("v");
			String op = request.getParameter("operator");
			
			int v = 0;
			if(!v_.equals("")) v = Integer.parseInt(v_);
			//값을 받는것
			
			
			//계산
			if(op.equals("=")) {  //이콜은 계산
				
				int reault = 0;
				if(op.equals("덧셈"))
						result = x+y;
				else
						result = x-y;
			}
			
			else {
				//값저장 덧셈뺄셈은 저장                              //request가 가지고 있는 함수
				ServletContext application = request.getServletContext(); //어플리케이션 저장소
				application.setAttribute("value", v);
				application.setAttribute("op", op);
			}
			
			
			
			
			response.getWriter().printf("result is %d\n", result); 
			
	}

	
}
