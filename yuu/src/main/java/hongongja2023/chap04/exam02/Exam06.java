package hongongja2023.chap04.exam02;

public class Exam06 {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++ ) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			} //for
			System.out.println();
		}
	}
}

/* 해설
 1 -4  → 첫줄      * 
   -3
   -2
   -1

 2 -4  → 둘쩨줄    ** 
   -3
   -2
   
 3 -4  → 세번째줄  *** 
   -3
  
 4 -4  → 네번째줄 **** 
 */