package ch7;


//����Ŭ����
public class CarExample {

	public static void main(String[] args) {
		//CarTire ��ü ����
		CarTire car = new CarTire();
		
		//CarTire ��ü�� run() �޼ҵ� 5�� �ݺ� ����
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			
			//�� ���� Ÿ�̾ ��ũ ������ HankookTire�� ��ü	
				case 1:
					System.out.println("�տ��� HankookTire �� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15);
					break;
					
			//�� ������ Ÿ�̾ ��ũ ���� �� KumhoTire �� ��ü	
				case 2:
					System.out.println("�տ����� KumhoTire �� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����" , 13);
					break;
			
			//�ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire �� ��ü		
				case 3:
					System.out.println("�ڿ��� HankookTire �� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���" , 14);
					break;
			
			//�ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire �� ��ü
				case 4:
					System.out.println("�ڿ����� KumhoTire �� ��ü");
					car.backRightTire = new KumhoTire("�ڿ�����", 17);
					break;
			}//switch
			
			//1ȸ���� ��µǴ� ������ ����
			System.out.println("---------------------");
			
			
		}

	}

}
