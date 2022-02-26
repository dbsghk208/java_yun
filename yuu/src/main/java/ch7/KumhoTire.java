package ch7;


//Tire의 자식클래스
public class KumhoTire extends Tire{
	//필드
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//다른내용을 출력하기 위해 재정의한 roll()메소드
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: "
				+(maxRotation-accumulatedRotation)+ "회");
			return  true;
		}else {
			System.out.println("*** "+ location + "KumhoTire 펑크 ***");
			return false;
		}
		
	}
	
}
