package ch7;

//부모클래스
public class CellPhone {

	//필드
	String model;
	String color;
	
	//생성자
	
	//메소드
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}// powerOn()

	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}// powerOff()
	
	public void bell() {
		System.out.println("벨이 울립니다.");		
	}//bell()
	
	public void sendVoice(String message) {
		System.out.println("자기: "+ message);
	}//sendVoice()
	
	public void receiveVoice(String message) {
		System.out.println("상대방: "+ message);
	}//receiveVoice()
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}//hangUp()
	
}
