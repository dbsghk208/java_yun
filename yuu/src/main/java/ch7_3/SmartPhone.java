package ch7_3;

//실체 클래스
public class SmartPhone extends Phone{ 
	//추상클래스를 가져다 쓰기위해서는 
	//new 연산자를 이용해서 객체 못 만들고 상속을 통해서만 자식 클래스 생성할수 있음
	
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	
	}
	
}
