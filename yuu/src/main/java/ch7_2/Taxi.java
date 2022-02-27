package ch7_2;


//자식클래스
//택시클래스는 Vehicle 클래스를 상속받아 메소드를 재정의 하고 있다.
public class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
