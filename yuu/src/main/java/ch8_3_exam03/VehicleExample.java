package ch8_3_exam03;

//실행클래스. 강제타입변환
public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //인터페이스 변수 = 구현객체  대입
		
		vehicle.run();  //인터페이스에 선언된 메소드는 run 밖에 없음
		//vehicle.checkFare();

		Bus bus = (Bus) vehicle;  //강제 타입 변환
		//구현객체 버스가 가진 메소드를 쓰기 위해 강제 타입 변환을 해준것
		//인터페이스 타입의 변수를 버스타입으로 강제 타입 변환
		
		bus.run();
		bus.checkFare();  // 강제타입변환으로 인해 Bus 클래스의 메소드 호출 가능해짐
	
		
	}

}
