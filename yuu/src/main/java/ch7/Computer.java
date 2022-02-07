package ch7;

//자식클래스
public class Computer extends Calculator {

	//재정의
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
}
