package ch2;

public class ForExam {

	public static void main(String[] args) {
		int sum =0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("1~5�� ��: " + sum);
		

		//�Ʒ��� ���� for ���� ����ϸ� �ڵ带 ���� �� ����
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100 �� ��: " + sum);
		
	}

}
