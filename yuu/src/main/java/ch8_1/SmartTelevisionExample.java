package ch8_1;

//인터페이스 변수에 구현객체 대입
public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;   //SmartTelevision 객체를 인터페이스 타입변수에 각각 대입 
		Searchable searchable = tv;    //SmartTelevision 객체를 인터페이스 타입변수에 각각 대입 

	}

}
