package ch7;

//Tire�� �ڽ�Ŭ����
public class HankookTire extends Tire{
	//�ʵ�
	
	
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}//HankookTire ������	
		
		
	//�ٸ� ������ ����ϱ� ���� �������� roll() �޼ҵ�
	//�޼ҵ�
	@Override
	public boolean roll() {
		
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ���� : " 
					+ (maxRotation-accumulatedRotation) + "ȸ");		
			return true;
			
		}else {
			System.out.println("*** " + location + "HankookTire ��ũ ***" );
			return false;
	
		}
	}// roll() �޼ҵ�
	
}
