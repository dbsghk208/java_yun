package ch7_3;

//�߻�Ŭ����
//�߻�޼ҵ� ����
public abstract class Animal {
	public String kind;
	
	
	public void breath() {
		System.out.println("���� ���ϴ�.");
		
	}
	
	public abstract void sound();  //�߻�޼ҵ�
				//�߰�ȣ�� ���ּ� �������� �ڽ�Ŭ������ �޼ҵ� ������ �ؾ���
				//�������� �ڽ�Ŭ�������� �ٸ��ϱ� �߻�޼ҵ� ���ִ°�
}
