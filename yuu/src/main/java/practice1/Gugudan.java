package practice1;

import java.io.IOException;

public class Gugudan {

	public static void main(String[] args)  throws IOException {
		
//		for(int i=2; i<10; i++) {
//			for (int j=1; j<10; j++) {
//				System.out.println(i + "x" + j + "=" + i*j);
//			}
//		}
		
		
		int dan,i;
		
		System.out.println("원하는 dan을 입력하세요: ");
		dan= System.in.read()-48;
		
		for (i=1; i<10; i++) {
			System.out.println(dan+ "*" + i+ "=" + dan*i);
		}
		
		
	}//main

}
