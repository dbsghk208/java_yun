package ch7_3;


//실행 클래스
public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();   //Phone 의 메소드
		smartPhone.internetSearch();  //SmartPhone의 메소드
		smartPhone.turnOff();  //Phone 의 메소드
		
	}
	
}
