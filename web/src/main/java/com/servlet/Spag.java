package com.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/spag")
public class Spag extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = 0;
		String num_ = request.getParameter("n");  //사용자로부터 값을 입력받는 도구. 그리고 입력된 값은 문자열로 인식된다.
		if(num_ !=null && num_.equals(""))
			num = Integer.parseInt(num_);

		String result;
		
		if(num%2 != 0) 
			//2로 나눴을때 나머지 값이 0이 아니면 홀수입니다 가 출력되게
	 		result = "홀수";
		else 
			result = "짝수";
		 
		request.setAttribute("result" , result);
							//여기 담는 변수는 내가 마음대로 지정해줘도 됨 대신 다르게 r이라고 준다면 jsp도 r 이라고 꺼내짐
		
		String[] names = {"newlec", "dragon"};
		request.setAttribute("names" , names);
		
		
		Map<String,Object> notice = new HashMap<String,Object>();
		notice.put("id", 1);
		notice.put("title", "EL은 좋아요");
		request.setAttribute("notice" , notice);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("spag.jsp");
		dispatcher.forward(request, response);
		//현재 작업했던 내용들을 포워드안에 담고 있다면 그내용이 spag.jsp 로 이어져서 요청 진행될것
		//이제 spag.jsp 는 서블릿임
		//jsp 에 있는 request,response 가 컨트롤러에서 포워드할때 전달했던 리퀘스트 리스판스와 똑같음
		//꺼내서 볼수도 있고 진행되었던 내용이 이어지는것이다.
		//이어지게 하는 저장소가 바로 request
		
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("spag.jsp");
		//jsp 로 이어지게 하는것. /를 넣지 않은것은 url 상으로 같은 디렉토리에 있기 때문에 경로 설정 안한것
	
		//디스패처를 이용해서 포워딩을 할수 있다
	
	
	}
}
