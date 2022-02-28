package ch7_2;


//메인클래스(Tire2, SnowTire2)
public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire2 snowTire2 = new SnowTire2();
		
		Tire2 tire2 = snowTire2;
		//위에서 자식타입으로 자동 타입변환 됨.
		
		//따라서 두개 다 run 함수는 자식클래스의 메소드로 실행결과가 나타난다.
		snowTire2.run();
		tire2.run();
		
	}

}
