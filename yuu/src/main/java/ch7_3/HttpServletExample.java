package ch7_3;

//����Ŭ����, ����Ŭ����
public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());  //���α��� �մϴ�.��
		method(new FileDownloadServlet());  //������ �ٿ�ε� �մϴ�.�� 

	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
