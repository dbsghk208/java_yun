package ch8_2.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//1번
		//위에 new 해줄 필요 없이 이렇게 바로 메소드를 호출 할 수 도 있고 
		//driver.drive(new Bus());
		//driver.drive(new Taxi());
		
		//2번
		// 객체를 만든다음에 그 객체를 매개변수에 넣어서 메소드를 호출할수도 잇다
		//drive(인터페이스 매개변수) 로 선언이 되어있기때문에 어떤 구현객체로든 대입이 가능하다.
		//구현객체에 따라 실행결과 달라짐
		driver.drive(bus);
		driver.drive(taxi);
		
	}

}
