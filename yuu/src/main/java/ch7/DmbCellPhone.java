package ch7;

//�ڽ� Ŭ����
public class DmbCellPhone extends CellPhone {
	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel) {
		this.model= model;   //CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		this.color= color;   //CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		this.channel= channel;
	}
	
	//�޼ҵ�
	public void turnOnDmb() {
		System.out.println("ä�� "+ channel + "�� DMB ��� ������ �����մϴ�.");
	}//turnOnDmb()
	
	public void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("ä��"+ channel+ "������ �ٲߴϴ�.");

	}//changeChannelDmb()
	
	public void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
		
	}//turnOffDmb()
	
}
