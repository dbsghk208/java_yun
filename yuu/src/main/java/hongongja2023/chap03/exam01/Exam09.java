package hongongja2023.chap03.exam01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		String str1 = scanner.nextLine();
		Double num1 = Double.parseDouble(str1);
		
		System.out.println("두번째 수 : ");
		String str2 = scanner.nextLine();
		Double num2 = Double.parseDouble(str2);
		
		System.out.println("-----------------");
		
		if (num2 != 0.0) {
			Double str3 = num1/num2;
			System.out.println("결과 : " +str3);
		} else {
			System.out.println("결과 : 무한대");
		}
		
	}

}
