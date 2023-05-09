package hongongja2023.chap04.exam02;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++ ) {
			if(i%2 != 0) {	//2로 나눈 나머지가 0이 아닐경우. 즉 홀수일 경우 if문 종료하지 않고 증감식으로 이동
				continue;
			}
			System.out.println(i);
		}
	}

}
