package ch2;

import java.io.IOException;

public class ForGugudan {

	public static void main(String[] args) throws IOException {
		
		//������
		//2�ܺ��� �����ϰ� 9�ܱ��� �����ϸ� �ݺ����� �ѹ� �������� 1�� ����

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
		
		System.out.print("���ϴ� dan�� �Է��ϼ���: ");
		dan= System.in.read()-48;
	
//		for(dan=2; dan<10; dan++) {
			for(i=1; i<10; i++) {
			System.out.println(dan + "*"+ i+"="+ dan*i);	
				
			}//i
//		}//dan
			
	
			
		
			
			

	}

}
