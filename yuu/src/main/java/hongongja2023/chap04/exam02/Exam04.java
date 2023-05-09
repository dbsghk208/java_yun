package hongongja2023.chap04.exam02;

public class Exam04 {
	public static void main(String[] args) {
		
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
		
				int sum = (4*x + 5*y);

				if (sum == 60) {
					System.out.println("("+ x +","+ y +")");
					
				}
			}
		} // for x
	}
}
