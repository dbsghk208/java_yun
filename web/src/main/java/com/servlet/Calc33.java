package com.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//@WebServlet("/calc33")
public class Calc33 extends HttpServlet {


	protected void service(HttpServletRequest request,HttpServlet response) throws ServletException, IOException {

		Cookie[] cookies = request.getCookies(); // 쿠키를 읽을 때 request 사용


		// 사용자가 입력한 내용
		String value = request.getParameter("value");
		String operator = request.getParameter("operator");
		String dot = request.getParameter("dot");
		
		// 쿠키에서 읽어와서 사용자가 입력한 내용 덧붙이는 작업.
		String exp = "";
		if(cookies != null) 
			for(Cookie c : cookies)
				if(c.getName().equals("exp")) {
					exp = c.getValue();
					break;
				}
		
		
		
		if(operator != null && operator.equals("=")) {
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
			try {
				exp = String.valueOf(engine.eval(exp));
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			// 쿠키 삭제 조건.
		} else if(operator != null && operator.equals("C")) {
			exp = "";	
			
		} else {
			// 쿠키로 저장하는 작업.
			// exp에 누적 진행(아래 중 null이 아닌 값 1가지만 오게됨)
			exp += (value == null)?"":value; // value가 null이면 ""빈문자열, 그렇지 않다면 value값을. 
			exp += (operator == null)?"":operator;
			exp += (dot == null)?"":dot;
		}
		
		// 쿠키저장하기
		Cookie expCookie = new Cookie("exp", exp); //쿠키를 생성한 다음 exp 를 쿠키에 넣고 
	  
		// 쿠키 삭제
		if(operator != null && operator.equals("C"))
			expCookie.setMaxAge(0);
		
		response.addCookie(expCookie);		
		response.sendRedirect("calcpage"); // redirect 사용 경로 우회
							//여기서 /calcPage 로 써도 됨 
			
	}

	
}
