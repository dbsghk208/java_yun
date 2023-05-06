package hongongja2023.chap03.exam01;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = scanner.nextLine();
		
		System.out.print("패스워드 : ");
		int pwd = scanner.nextInt();
		
		if (id.equals("java")) {
			if (pwd == 12345) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("비밀번호가 틀렸습니다.비밀번호 확인해주세요");
			}
		} else {
			System.out.println("해당 아이디가 존재하지 않습니다.");
		}
		
	}

}
