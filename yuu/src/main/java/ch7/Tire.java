package ch7;

//Tire Ŭ����
public class Tire {

	//�ʵ�
	public int maxRotation;  //�ִ� ȸ����(Ÿ�̾����)
	public int accumulatedRotation;  //����ȸ����
	public String location;   //Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRotation) {
		this.location= location;   //public String location �ʱ�ȭ(������ ������)
		this.maxRotation = maxRotation;  
		//public int maxRotation �ʱ�ȭ(������ ������)
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;   //���� ȸ���� 1 ����
		
		if(accumulatedRotation < maxRotation) {
		//���� ȸ��(���� < �ִ�)�� ��� ����	
			System.out.println(
			location + " Tire ���� : " +
			(maxRotation-accumulatedRotation) + "ȸ");
			return true;
		
		} else {
		//��ũ(���� = �ִ�)�� ��� ����	
			System.out.println("*** "+ location + "Tire ��ũ ***");
			return false;
			
		}
		
	}
	
}
