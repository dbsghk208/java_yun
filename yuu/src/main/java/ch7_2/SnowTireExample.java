package ch7_2;


//����Ŭ����(Tire2, SnowTire2)
public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire2 snowTire2 = new SnowTire2();
		
		Tire2 tire2 = snowTire2;
		//������ �ڽ�Ÿ������ �ڵ� Ÿ�Ժ�ȯ ��.
		
		//���� �ΰ� �� run �Լ��� �ڽ�Ŭ������ �޼ҵ�� �������� ��Ÿ����.
		snowTire2.run();
		tire2.run();
		
	}

}
