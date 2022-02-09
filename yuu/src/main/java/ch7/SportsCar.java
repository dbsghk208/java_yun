package ch7;

public class SportsCar extends Car {
	@Override 
	public void speedUp() {
		speed += 10;
	}
	
	// 재정의 할수 없음
	//부모 클래스에 선언된  final 메소드는 자식 클래스에서 재정의할 수 없으므로
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}

}
