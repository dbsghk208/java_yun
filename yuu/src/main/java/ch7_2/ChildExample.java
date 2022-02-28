package ch7_2;


//강제타입변환
public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();  //자동 타입 변환
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//불가능. 타입이 부모타입으로 변환되었기 때문에 자식클래스에 있는 메소드는 사용하지 못함.
//		parent.field2 = "data2";
//		parent.method3();
		
		
		//강제 타입변환 
		//자식클래스의 메소드를 쓰기위해서는 다시 강제타입변환으로 자식타입으로 바꿔준 다음 
		//자식클래스의 메소드를 사용할수 있음
		Child child = (Child)parent;
		
		//가능
		child.field2 ="yyy";  
		child.method3();

	}

}
