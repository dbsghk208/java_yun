package ch7_3;

//��üŬ����, �ڽ�Ŭ����
//�߻� �޼ҵ� ������
public class Cat extends Animal {
	public Cat() {
		this.kind = "������";   // �߻�Ŭ������ �ʵ�
		
	}
		
	//�߻�޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}
