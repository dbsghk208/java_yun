package ch7_2;


//����Ÿ�Ժ�ȯ
public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();  //�ڵ� Ÿ�� ��ȯ
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//�Ұ���. Ÿ���� �θ�Ÿ������ ��ȯ�Ǿ��� ������ �ڽ�Ŭ������ �ִ� �޼ҵ�� ������� ����.
//		parent.field2 = "data2";
//		parent.method3();
		
		
		//���� Ÿ�Ժ�ȯ 
		//�ڽ�Ŭ������ �޼ҵ带 �������ؼ��� �ٽ� ����Ÿ�Ժ�ȯ���� �ڽ�Ÿ������ �ٲ��� ���� 
		//�ڽ�Ŭ������ �޼ҵ带 ����Ҽ� ����
		Child child = (Child)parent;
		
		//����
		child.field2 ="yyy";  
		child.method3();

	}

}
