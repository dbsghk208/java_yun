package ch2;

public class VariableUseExample {

	public static void main(String[] args) {
		
		int hour =3;
		int minute =5;
		System.out.println(hour+ "�ð�" + minute+ "��");
		
		int totalMinute = (hour*60)+minute;
		// int totalMinute = (3*60) + minute;  //���� hour �� ����� ������ ��ġ
		// int totalMinute = 180 + 5;   //���� minute�� ����� ������ ��ġ
		// int totalMinute = 185;  // 185�� ���� totalMinute �� ����
		
		
		System.out.println("�� "+ totalMinute + "��");

	}

}

