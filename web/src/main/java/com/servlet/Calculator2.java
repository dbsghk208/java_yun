package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator") //사용자가 이 url로 요청을 한다.
public class Calculator2 extends HttpServlet {

	//get 요청 왔을때
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메소드가 호출되었습니다");
	
		
			Cookie[] cookies = request.getCookies();
			
			String exp = "0"; //아무런 쿠키도 없는 경우 기본값 0
			if(cookies != null) 
				for(Cookie c : cookies)
					if(c.getName().equals("exp")) {
						exp = c.getValue();
						break;
					}
			
			
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			
			out.write("<!DOCTYPE html>");
			out.write("<html>");
			out.write("<head>");
			out.write("<meta charset=\"UTF-8\">");
			out.write("<title>Insert title here</title>");
			out.write("<style>");
			out.write("input {");
			out.write("width: 50px;");
			out.write("height: 50px;");
			out.write("}");

			out.write(".output {");
			out.write("height: 50px;");
			out.write("background: #e9e9e9;");
			out.write("font-size: 24px;");
			out.write("font-weight: bold;");
			out.write("text-align: right;");
			out.write("padding: 0px, 5px;");
			out.write("}");
			out.write("</style>");
			out.write("</head>");
			out.write("<body>");
			out.write("	<form method=\"post\">");
			out.write("		<table>");
			out.write("			<tr>");
			out.printf("				<td class=\"output\" colspan=\"4\">%s</td>", exp);
			out.write("			</tr>");
			out.write("			<tr>");
			out.write("				<td><input type=\"submit\" name=\"operator\" value=\"CE\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"operator\" value=\"C\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"operator\" value=\"BS\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"operator\" value=\"/\" /></td>");
			out.write("			</tr>");
			out.write("			<tr>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"7\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"8\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"9\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"*\" /></td>");
			out.write("			</tr>");
			out.write("			<tr>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"4\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"5\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"6\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"operator\" value=\"-\" /></td>");
			out.write("			</tr>");
			out.write("			<tr>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"1\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"2\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"3\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"operator\" value=\"+\" /></td>");
			out.write("			</tr>");
			out.write("			<tr>");
			out.write("				<td></td>");
			out.write("				<td><input type=\"submit\" name=\"value\" value=\"0\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"dot\" value=\".\" /></td>");
			out.write("				<td><input type=\"submit\" name=\"operator\" value=\"=\" /></td>");
			out.write("			</tr>");
			out.write("		</table>");
			out.write("	</form>");
			out.write("</body>");
			out.write("</html>");
			
	
	
	}
	
	//post 요청 왔을때
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메소드가 호출되었습니다");

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
		
		expCookie.setPath("/calculator");  //쿠키가 전달받는 결로를 설정.
		response.addCookie(expCookie);		
		response.sendRedirect("calculator"); // redirect 사용 경로 우회
						//자기가 자기를 요청하더라도 get요청을 의미함	
		
	}
	
}
