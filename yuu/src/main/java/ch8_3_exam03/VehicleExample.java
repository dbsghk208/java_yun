package ch8_3_exam03;

//����Ŭ����. ����Ÿ�Ժ�ȯ
public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //�������̽� ���� = ������ü  ����
		
		vehicle.run();  //�������̽��� ����� �޼ҵ�� run �ۿ� ����
		//vehicle.checkFare();

		Bus bus = (Bus) vehicle;  //���� Ÿ�� ��ȯ
		//������ü ������ ���� �޼ҵ带 ���� ���� ���� Ÿ�� ��ȯ�� ���ذ�
		//�������̽� Ÿ���� ������ ����Ÿ������ ���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare();  // ����Ÿ�Ժ�ȯ���� ���� Bus Ŭ������ �޼ҵ� ȣ�� ��������
	
		
	}

}
