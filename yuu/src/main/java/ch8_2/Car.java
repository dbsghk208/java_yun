package ch8_2;

public class Car {

	//�������̽��� Ÿ�Կ� �ʵ带 �������ذ�
	//tire �� ���� Ŭ������ ����� ���� tire �� �ʱⰪ�� �������ֱ�
	Tire frontLeftTire = new HankookTire();  
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
	}
	
}
