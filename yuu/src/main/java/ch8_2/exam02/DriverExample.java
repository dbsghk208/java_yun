package ch8_2.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//1��
		//���� new ���� �ʿ� ���� �̷��� �ٷ� �޼ҵ带 ȣ�� �� �� �� �ְ� 
		//driver.drive(new Bus());
		//driver.drive(new Taxi());
		
		//2��
		// ��ü�� ��������� �� ��ü�� �Ű������� �־ �޼ҵ带 ȣ���Ҽ��� �մ�
		//drive(�������̽� �Ű�����) �� ������ �Ǿ��ֱ⶧���� � ������ü�ε� ������ �����ϴ�.
		//������ü�� ���� ������ �޶���
		driver.drive(bus);
		driver.drive(taxi);
		
	}

}
