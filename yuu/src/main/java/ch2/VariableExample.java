package ch2;

public class VariableExample {

	public static void main(String[] args) {
		
		/* 잘못된 코딩 예
		//변수 value 선언
		int value;
		
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result 의 초기값으로 저장
		int result= value+10;  // value 의 값이 저장되지 않아서 해당변수는 컴파일 에러 발생
		
		*/
		
		//변수 value 선언, 30으로 초기화
		int value=30;
		
		//value 값(30)을 읽고 10을 더해서 변수 result 에 저장
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);

	}

}
