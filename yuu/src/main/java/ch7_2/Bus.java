package ch7_2;


//자식클래스
//버스클래스는 Vehicle 클래스를 상속받아 run()메소드를 재정의하고 있습니다.
public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}
	
}
