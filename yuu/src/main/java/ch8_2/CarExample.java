package ch8_2;

//실행클래스
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		//원래는 위에 까지만 코드가 있을때는 Car 클래스에서 한국타이어 가 필도로 대입되어서
		//한국타이어의 메소드밖에 실행이 안됫지만
		//아래처럼
		//다른 구현객체로 교체하게 되면 실행결과가 달라진다.
		myCar.frontLeftTire = new KumhoTire(); 
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();  // 각타이어의  roll 메소드를 호출하게 된다.
	}
}
