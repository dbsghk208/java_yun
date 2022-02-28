package ch7_2;

public class InstanceofExample {

	public static void method1(Parent2 parent2){
		
		if(parent2 instanceof Child2) { //Child 타입으로 변환이 가능한지 확인
		
			Child2 child = (Child2)parent2;
			
			System.out.println("method1 - Child 변환 성공");
		
		} else {
			
			System.out.println("method1 - Chile 로 변환되지 않음");
			
		} //if 문

	}//method1
	
	public static void method2(Parent2 parent2) {
		Child2 child = (Child2)parent2;    //ClassCastException 발생할 가능성 있음
	
		System.out.println("method2 - Child로 변환 성공");
	}//method2
	
	
	public static void main(String[] args) {
		Parent2 parentA = new Child2();
	
		//Child 객체를 매개값으로 전달
		method1(parentA);
		method2(parentA);
		
		
		Parent2 parentB = new Parent2();
		
		//Parent 객체를 매개값으로 전달
		method1(parentB);
		method2(parentB);
		
	}
	

}
