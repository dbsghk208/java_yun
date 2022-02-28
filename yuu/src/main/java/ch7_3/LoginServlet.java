package ch7_3;

//실체클래스, 자식클래스
public class LoginServlet extends HttpServlet {
	
	//추상클래스의 추상메소드를 오버라이드 어노테이션으로 불러와서 실행내용을 기재해준다
	//자식클래스에서 실행내용이 다를때 추상메소드를 써서
	//각 자식클래스마다 추상메소드 불러오는것.
	@Override
	public void service() {
		System.out.println("로그인합니다.");
	
	}
}
