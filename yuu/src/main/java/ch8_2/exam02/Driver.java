package ch8_2.exam02;


public class Driver {  
	public void drive(Vehicle vehicle) {
		// Vehicle 인터페이스가 매개변수 타입으로 사용됨 
		//따라서 drive 라는 메소드를 호출할때 매개변수 자리 () 안에는 다향한 구현객체가 대입될수 있다.
		
		vehicle.run(); //런을 호출하게 되면 매개변수자리() 에 대입된 구현객체의 run이 호출되게 된다.
		
	}
}
