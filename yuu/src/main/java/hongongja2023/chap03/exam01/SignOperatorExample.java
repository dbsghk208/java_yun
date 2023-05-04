package hongongja2023.chap03.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= "+ result1);  // -100
		System.out.println("result2= "+ result2);  // 100

		byte b = 100;
		//byte result3 = -b;  //-- 연산 결과값을 byte 타입으로 저장하면 컴파일 에러 발생함
							  // byte 타입 값을 부호 연산하면 int 타입 값으로 바뀌므로 컴파일 에러 발생	
		int result3 = -b;
		System.out.println("result3= "+ result3);
	}

}
