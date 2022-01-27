package ch2;

import java.io.IOException;

public class ForGugudan {

	public static void main(String[] args) throws IOException {
		
		//구구단
		//2단부터 시작하고 9단까지 실행하며 반복문이 한번 돌때마다 1씩 증가

//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				System.out.println(i+ "x" +j + "="+ i*j);
//				
//			}//for j
//			
//		}//for i
//		
//		System.out.println();
		
		
		int dan,i;
		
		System.out.print("원하는 dan을 입력하세요: ");
		dan= System.in.read()-48;
	
//		for(dan=2; dan<10; dan++) {
			for(i=1; i<10; i++) {
			System.out.println(dan + "*"+ i+"="+ dan*i);	
				
			}//i
//		}//dan
			
	
			
		
			
			

	}

}
