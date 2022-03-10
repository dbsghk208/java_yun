package ch8_1;


//Dog와 Cat 클래스의 실행결가를 출력하는 클래스

public class SoundableExample {

	private static void printSound(Soundable soundable) {
							//인터페이스 타입의 매개 변수를 가지고 있다.
		
		System.out.println(soundable.sound());
	}
		
	public static void main(String[] args) {
		printSound(new Dog());
		printSound(new Cat());
	}

}
