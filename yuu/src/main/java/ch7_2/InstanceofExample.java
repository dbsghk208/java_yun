package ch7_2;

public class InstanceofExample {

	public static void method1(Parent2 parent2){
		
		if(parent2 instanceof Child2) { //Child Ÿ������ ��ȯ�� �������� Ȯ��
		
			Child2 child = (Child2)parent2;
			
			System.out.println("method1 - Child ��ȯ ����");
		
		} else {
			
			System.out.println("method1 - Chile �� ��ȯ���� ����");
			
		} //if ��

	}//method1
	
	public static void method2(Parent2 parent2) {
		Child2 child = (Child2)parent2;    //ClassCastException �߻��� ���ɼ� ����
	
		System.out.println("method2 - Child�� ��ȯ ����");
	}//method2
	
	
	public static void main(String[] args) {
		Parent2 parentA = new Child2();
	
		//Child ��ü�� �Ű������� ����
		method1(parentA);
		method2(parentA);
		
		
		Parent2 parentB = new Parent2();
		
		//Parent ��ü�� �Ű������� ����
		method1(parentB);
		method2(parentB);
		
	}
	

}
