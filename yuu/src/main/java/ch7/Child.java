package ch7;


//�ڵ� Ÿ�Ժ�ȯ ���� ��� ����
public class Child extends Parent{
	
	//�ڽ�Ŭ�������� �޼ҵ� ������(�Ȱ��� �޼ҵ�  ParentŬ�������� ����)
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
		
	}
	
}
