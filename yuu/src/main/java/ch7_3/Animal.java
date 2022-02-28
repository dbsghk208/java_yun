package ch7_3;

//추상클래스
//추상메소드 선언
public abstract class Animal {
	public String kind;
	
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
		
	}
	
	public abstract void sound();  //추상메소드
				//중괄호를 없애서 실행결과는 자식클래스에 메소드 재정의 해야함
				//실헹결과가 자식클래스마다 다르니까 추상메소드 써주는것
}
