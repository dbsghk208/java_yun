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
		
		String [] num_ = request.getParameterValues("num");  //������ �̸����� �������ö��� getParameter ��� getParameterValues
		
		int result = 0;
		
		//�ݺ�
		for(int i=0; i<num.length; i++ ) {
			int num = Integer.parseInt(num_[i]);
			//������ �ݺ������� ������ �ݺ��Ǵ� ���� ����.
			//�׷��� for�� �ȿ� ���� ���� ���൵ ��
			
			result+=num;
		}
		
			
		response.getWriter().printf("result is %d\n", result); 
		// num �迭���� ���еǼ� ���µ�
		//�����̸����� ���޵� Ű������ �������� �迭�� ����Ҽ� �յ��� �Ѵٴ°�
	}
	
}
