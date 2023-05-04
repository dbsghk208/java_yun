package hongongja2023.chap02.exam10;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData =scanner.nextLine();
			System.out.println("입력된 문자열: \""+ inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}
		} //while
	
	
		System.out.println("종료");
	}

}
