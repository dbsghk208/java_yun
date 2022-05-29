package com.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebServlet("/calc2")
public class Calc3 extends HttpServlet {


	protected void service(HttpServletRequest request,HttpServlet response) throws ServletException, IOException {
			
			ServletContext application = request.getServletContext();  //어플리케이션 저장소
			HttpSession session = request.getSession(); // 세션을 얻어오기
			//세션을 변수화
			Cookie[] cookies = request.getCookies();  //쿠키가 배열로 오기때문에 배열로 선언한다. 키와 벨류값을 담아서 오는데 그걸 여러개 보낼수도 잇으니까!
			//사용자가 보내준 쿠키 읽기
			
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
			String v_ = request.getParameter("v");
			String op = request.getParameter("operator");
			
			int v = 0;
			if(!v_.equals("")) v = Integer.parseInt(v_);
			//값을 받는것
			
			
			//계산
			if(op.equals("=")) { //이콜은 계산
				
				//값을 꺼내는작업. 원래는 오브젝트로 값을 반환한다.
				//int x = (Integer)application.getAttribute("value");     //어플리케이션저장소에 담겨진 값,전달된값  
				//int x = (Integer)session.getAttribute("value"); 
				//쿠키를 그안에서 반복문을 통해 찾아서 읽혀지니깐 for문을 쓴다
				int x = 0;
				
				for(Cookie c : cookies)  //��Ű�� ���� �迭�� ������ ���� for��
					if(c.getName().equals("value"))  {//�̸����� �˻�����
						x = Integer.parseInt(c.getValue());
						break;  //ã������ �����°�.
					}
					
					
				int y = v;	//���� ����ڰ� ������ ��	
				//String opertator = (String)application.getAttribute("op");
				//String opertator = (String)session.getAttribute("op");
				
				
				String operator = "";
				for(Cookie c : cookies)  //쿠키가 가진 배열의 갯수를 도는 for문
					if(c.getName().equals("op"))  {//이름으로 검색한후
						operator = c.getValue();
						break;  //찾았으면 나오는것.
					}
				
				
				
				int reault = 0;
				
				if(opertator.equals("+"))
						result = x+y;
				else
						result = x-y;
				
				response.getWriter().printf("result is %d\n", result); 
			}
			
			//값저장 덧셈뺄셈은 저장                              //request가 가지고 있는 함수
			else {
				
//				application.setAttribute("value", v);  //값을 담는 작업
//				application.setAttribute("op", op);
//				session.setAttribute("value", v);  //값을 담는 작업
//				session.setAttribute("op", op);
				
				Cookie valueCookie = new Cookie("value",String.valueOf(v));  //cookie 값으로는 반드시 url 에 사용할수 있는형태의 문자열로만 보낼수 있다.
				Cookie opCookie = new Cookie("op", op);
				
				response.addCookie(valueCookie); // 클라이언트에게 전달이 된다.
				response.addCookie(opCookie);
			}
				
	}


	
}
