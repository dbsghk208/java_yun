package hongongja2023.chap02.exam10;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			if(keyCode == 113) { //q 키코드 = 113
				break;
			}
		}
		
		System.out.println("종료");
		
	}

}
