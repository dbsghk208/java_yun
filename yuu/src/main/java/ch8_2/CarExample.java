package ch8_2;

//����Ŭ����
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		//������ ���� ������ �ڵ尡 �������� Car Ŭ�������� �ѱ�Ÿ�̾� �� �ʵ��� ���ԵǾ
		//�ѱ�Ÿ�̾��� �޼ҵ�ۿ� ������ �ȵ�����
		//�Ʒ�ó��
		//�ٸ� ������ü�� ��ü�ϰ� �Ǹ� �������� �޶�����.
		myCar.frontLeftTire = new KumhoTire(); 
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();  // ��Ÿ�̾���  roll �޼ҵ带 ȣ���ϰ� �ȴ�.
	}
}
