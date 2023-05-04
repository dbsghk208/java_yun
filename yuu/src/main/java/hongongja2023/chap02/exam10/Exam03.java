package hongongja2023.chap02.exam10;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수정보입력]");
		
		System.out.print("1. 이름 : ");
		String name = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리 : ");
		String ssn = scanner.nextLine();
		System.out.print("3. 전화번호  : ");
		String phone = scanner.nextLine();
		
		System.out.println("-------------------------------");
		System.out.println("[입력한 내용]");
		System.out.println("이름 : "+ name);
		System.out.println("주민번호 앞 6자리 : "+ ssn);
		System.out.println("전화번호 : "+ phone);
		
	}
}
