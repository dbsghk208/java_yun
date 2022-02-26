package ch7;


//실행클래스
public class CarExample {

	public static void main(String[] args) {
		//CarTire 객체 생성
		CarTire car = new CarTire();
		
		//CarTire 객체의 run() 메소드 5번 반복 실행
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			
			//앞 왼쪽 타이어가 펑크 났을때 HankookTire로 교체	
				case 1:
					System.out.println("앞왼쪽 HankookTire 로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
					
			//앞 오른쪽 타이어가 펑크 났을 때 KumhoTire 로 교체	
				case 2:
					System.out.println("앞오른쪽 KumhoTire 로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽" , 13);
					break;
			
			//뒤왼쪽 타이어가 펑크 났을 때 HankookTire 로 교체		
				case 3:
					System.out.println("뒤왼쪽 HankookTire 로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽" , 14);
					break;
			
			//뒤오른쪽 타이어가 펑크 났을 때 KumhoTire 로 교체
				case 4:
					System.out.println("뒤오른쪽 KumhoTire 로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);
					break;
			}//switch
			
			//1회전시 출력되는 내용을 구분
			System.out.println("---------------------");
			
			
		}

	}

}
