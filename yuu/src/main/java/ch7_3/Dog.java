package ch7_3;

//��ü Ŭ����, �ڽ�Ŭ����
//�߻�޼ҵ� ������
public class Dog extends Animal {
	public Dog() {
		this.kind = "������"; // �߻�Ŭ������ �ʵ�
		
	}
	
	
	//�߻� �޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("�۸�");
		
	}
	
}
