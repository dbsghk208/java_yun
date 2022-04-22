package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/add2")
public class Add2 extends HttpServlet {

protected void service(HttpServletRequest request,HttpServlet response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		String [] num_ = request.getParameterValues("num");  //동일한 이름으로 여러개올때는 getParameter 대신 getParameterValues
		
		int result = 0;
		
		//반복
		for(int i=0; i<num.length; i++ ) {
			int num = Integer.parseInt(num_[i]);
			//연산은 반복되지만 선언은 반복되는 일이 없다.
			//그래서 for문 안에 변수 선언 해줘도 됨
			
			result+=num;
		}
		
			
		response.getWriter().printf("result is %d\n", result); 
		// num 배열들이 구분되서 갔는데
		//같은이름으로 전달된 키값들을 서버에서 배열로 사용할수 잇도록 한다는것
	}
	
}
