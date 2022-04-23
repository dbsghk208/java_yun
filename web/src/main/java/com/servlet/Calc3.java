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
			
			ServletContext application = request.getServletContext(); //���ø����̼� �����
			HttpSession session = request.getSession();// ������ ������
			//������ ����ȭ
			Cookie[] cookies = request.getCookies();  //��Ű�� �迭�� ���⶧���� �迭�� �����Ѵ�. Ű�� �������� ��Ƽ� ���µ� �װ� ������ �������� �����ϱ�!
			//����ڰ� ������ ��Ű �б�
			
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
			String v_ = request.getParameter("v");
			String op = request.getParameter("operator");
			
			int v = 0;
			if(!v_.equals("")) v = Integer.parseInt(v_);
			//���� �޴°�
			
			
			//���
			if(op.equals("=")) {  //������ ���
				
						//���� �������۾�. ������ ������Ʈ�� ���� ��ȯ�Ѵ�.
				//int x = (Integer)application.getAttribute("value");     //���ø����̼�����ҿ� ����� ��,���޵Ȱ�  
				//int x = (Integer)session.getAttribute("value"); 
				//��Ű�� �׾ȿ��� �ݺ����� ���� ã�Ƽ� �������ϱ� for���� ����
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
				for(Cookie c : cookies)  //��Ű�� ���� �迭�� ������ ���� for��
					if(c.getName().equals("op"))  {//�̸����� �˻�����
						operator = c.getValue();
						break;  //ã������ �����°�.
					}
				
				
				
				int reault = 0;
				
				if(opertator.equals("+"))
						result = x+y;
				else
						result = x-y;
				
				response.getWriter().printf("result is %d\n", result); 
			}
			
			//������ ���������� ����                              //request�� ������ �ִ� �Լ�
			else {
				
//				application.setAttribute("value", v);  //���� ��� �۾�
//				application.setAttribute("op", op);
//				session.setAttribute("value", v);  //���� ��� �۾�
//				session.setAttribute("op", op);
				
				Cookie valueCookie = new Cookie("value",String.valueOf(v));  //cookie �����δ� �ݵ�� url �� ����Ҽ� �ִ������� ���ڿ��θ� ������ �ִ�.
				Cookie opCookie = new Cookie("op", op);
				
				response.addCookie(valueCookie); // Ŭ���̾�Ʈ���� ������ �ȴ�.
				response.addCookie(opCookie);
			}
				
	}

	
}
