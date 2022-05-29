package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator") //사용자가 이 url로 요청을 한다.
public class Calculator extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//get,post 방식 서비스함수에서 나눠서 처리하는 방법
		
		//입력도구로서의 request가능중 getMethod . 메소드가 겟으로 왔냐 포스트로 왔냐
		if(req.getMethod().equals("GET")) {
			      			   //문자열로 받는데 그 문자열로 올때 여기 서블릿에서는 GET 대문자로 비교해준다.
		
			System.out.println("GET 요청이 왔습니다.");  //get 요청이 왔다는 출력문
		}
		else if(req.getMethod().equals("POST")) {
			System.out.println("POST 요청이 왔습니다."); 
		}
		
		super.service(req, resp);
		//요청에 따른 do함수 호출하게 하는 메소드
		//그런데 여기서는 두겟 메소드가 정의가 안됫으니간 오류메세지가 뜬다.
	}

	
	
	//super.service(req, resp); 를 거쳐 여기로 내려온다
	//밑에 추가해준다 두겟,두포스트 메소드를! 그래야 405 에러가 안뜸
	
	//post 요청 왔을때
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost 메소드가 호출되었습니다");
	}
	
	//get 요청 왔을때
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet 메소드가 호출되었습니다");
	}
	
	//** 서비스함수를 통해서 doPost(), doGet() 메소드가 호출된다. 
	//** ->(서비스함수에서 super.service(req, resp);있다면 서비스함수에서 끝나지않고 405 에러가 뜬다. )
	
	//** 따라서 원래는 doPost(), doGet()  단독으로 호출될 수도 있다.
	//** 겟과 포스트를 한번에 처리하는 함수가 필요할때 위의 service 함수를 오버라이드 해서 사용하는것이다.
		
	
}