package hongongja2023.chap04.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if (score < 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");  //if문이 블록이 걸려있지 않아 실행문 한개만 조건이 해당됨 
												//따라서 해당 실행문은 if 조건에 영향 받지 않고 무조건 실행됨
		
	}

}
