package ch8_1;

//인터페이스 변수에 구현객체 대입
public class RemoteControlExample {

	public static void main(String[] args) {
	
		RemoteControl rc; //인터페이스 변수 선언
		rc = new Television();   //변수에 구현객체 대입
		rc = new Audio();    //변수에 구현객체 대입

	}

}
