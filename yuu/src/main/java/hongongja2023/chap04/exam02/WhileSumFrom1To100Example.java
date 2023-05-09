package hongongja2023.chap04.exam02;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while (i<100) {
			sum += 1;
			i++;
		}
		
		System.out.println("1~"+ (i-1)+ " 합 : " + sum);
	}

}
