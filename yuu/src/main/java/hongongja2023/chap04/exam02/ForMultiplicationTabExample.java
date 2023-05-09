package hongongja2023.chap04.exam02;

public class ForMultiplicationTabExample {

	public static void main(String[] args) {
		for (int m =2; m <= 9; m++) {  //바깥쪽 for문 
			System.out.println("*** "+ m +"단 ***");
			
			for (int n=1; n<=9; n++) {  //중첩 for문
				System.out.println(m + " x "+ n + " = "+ (m*n));
			}
		}
	}

}
