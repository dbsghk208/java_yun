package ch2;

public class SingletonExam {

	public static void main(String[] args) {
		
		//������ ���� > new �� �ҷ����� �ȵ�. �̹� �̱��� �������� �������־��� ������!!
//		SingletonHon obj1 = new SingletonHon();
//		SingletonHon obj2 = new SingletonHon();
		
		SingletonHon obj1 = SingletonHon.getInstance();
		SingletonHon obj2 = SingletonHon.getInstance();
		
			if(obj1== obj2) {
				System.out.println("���� Sington ��ü�Դϴ�.");
			}else {
				System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
			}
		
		
	}

}
