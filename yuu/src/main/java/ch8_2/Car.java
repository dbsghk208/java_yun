package ch8_2;

public class Car {

	//인터페이스로 타입에 필드를 선언해준것
	//tire 의 구현 클래스를 만들고 나서 tire 의 초기값을 대입해주기
	Tire frontLeftTire = new HankookTire();  
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
	}
	
}
