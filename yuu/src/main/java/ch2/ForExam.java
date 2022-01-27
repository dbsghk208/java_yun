package ch2;

public class ForExam {

	public static void main(String[] args) {
		int sum =0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("1~5의 합: " + sum);
		

		//아래와 같이 for 문을 사용하면 코드를 줄일 수 있음
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100 의 합: " + sum);
		
	}

}
