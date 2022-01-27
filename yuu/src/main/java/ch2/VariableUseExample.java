package ch2;

public class VariableUseExample {

	public static void main(String[] args) {
		
		int hour =3;
		int minute =5;
		System.out.println(hour+ "시간" + minute+ "분");
		
		int totalMinute = (hour*60)+minute;
		// int totalMinute = (3*60) + minute;  //변수 hour 에 저장된 값으로 대치
		// int totalMinute = 180 + 5;   //변수 minute에 저장된 값으로 대치
		// int totalMinute = 185;  // 185를 변수 totalMinute 에 저장
		
		
		System.out.println("총 "+ totalMinute + "분");

	}

}

