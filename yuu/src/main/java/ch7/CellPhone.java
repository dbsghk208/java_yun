package ch7;

//�θ�Ŭ����
public class CellPhone {

	//�ʵ�
	String model;
	String color;
	
	//������
	
	//�޼ҵ�
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}// powerOn()

	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}// powerOff()
	
	public void bell() {
		System.out.println("���� �︳�ϴ�.");		
	}//bell()
	
	public void sendVoice(String message) {
		System.out.println("�ڱ�: "+ message);
	}//sendVoice()
	
	public void receiveVoice(String message) {
		System.out.println("����: "+ message);
	}//receiveVoice()
	
	public void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}//hangUp()
	
}
