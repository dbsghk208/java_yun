package ch7_3;

//실행클래스
public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		
		System.out.println("-----");
	
	//변수와 자동 타입 변환
		Animal animal = null;
		
		//자동 타입 변환 및 재정의된 메소드 호출
		animal = new Dog();
		animal.sound();
		
		//자동 타입 변환 및 재정의된 메소드 호출
		animal = new Cat();
		animal.sound();
		
		System.out.println("-----");
		
	//메소드 다형성
		//아래 animalSound(Animal animal) 메소드로 자동 타입 변환
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
									//자동타입변환
	public static void animalSound(Animal animal) {
		animal.sound(); //재정의된 메소드 호출
	}
	
}
