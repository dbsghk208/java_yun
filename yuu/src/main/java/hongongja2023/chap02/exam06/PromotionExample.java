package hongongja2023.chap02.exam06;

public class PromotionExample {

	public static void main(String[] args) {
		//byte < short < int < long < float < double 
		
		//자동타입변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : "+ floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : "+doubleValue);
	}

}
