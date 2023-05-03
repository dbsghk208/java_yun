package hongongja2023.chap02.exam05;

public class BooleanAnswer {
	public static void main(String[] args) {
		boolean stop = false;
		
		if (stop) {  // stop 변수가 true 일때
			System.out.println("멈춥니다.");
		} else {
			System.out.println("출발합니다.");
		}
		// 만약 위에서 stop 변수가 false 인것을 코드로 표현하려면
		// if (!stop) 또는 if(stop == false)  이렇게 기재했어야함
	}
}
