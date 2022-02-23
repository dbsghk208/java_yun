package ch7;


//자동 타입변환 후의 멤버 접근
public class Child extends Parent{
	
	//자식클래스에서 메소드 재정의(똑같은 메소드  Parent클래스에도 있음)
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
		
	}
	
}
