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
			//���� �޴°�
			
			
			//���
			if(op.equals("=")) {  //������ ���
				
				int reault = 0;
				if(op.equals("����"))
						result = x+y;
				else
						result = x-y;
			}
			
			else {
				//������ ���������� ����                              //request�� ������ �ִ� �Լ�
				ServletContext application = request.getServletContext(); //���ø����̼� �����
				application.setAttribute("value", v);
				application.setAttribute("op", op);
			}
			
			
			
			
			response.getWriter().printf("result is %d\n", result); 
			
	}

	
}
