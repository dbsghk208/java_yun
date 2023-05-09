package hongongja2023.chap04.exam02;

public class Exam05 {

	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
				if (j == i) {
					System.out.println();
				}
			}
		}
	}

}

/* 해설
1 -1  → 첫줄 * 

2 -1
  - 2  → 둘째줄 ** 

3 - 1
   - 2 
   - 3  → 셋째줄 *** 

4 - 1
   - 2 
   - 3
   - 4  → 넷째줄 ****
 */
