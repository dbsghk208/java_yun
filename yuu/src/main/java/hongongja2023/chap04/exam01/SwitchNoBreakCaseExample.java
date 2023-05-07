package hongongja2023.chap04.exam01;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) +8;    //8 <= ... <= 11 사이의 정수 뽑기
		// (int)(Math.random() * n) +start; 
		// start 숫자에서부터 n개의 정수 사이의 랜덤 정수 값 얻는 연산식
		
		System.out.println("[현재 시각 : "+ time + " 시]");
		
		switch (time) {
			case 8 : 
				System.out.println("출근합니다.");
			case 9 :
				System.out.println("회의를 합니다.");
			case 10 :
				System.out.println("업무를 봅니다.");
			default :
				System.out.println("외근을 나갑니다.");
		}
	}

}
