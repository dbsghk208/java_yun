package ch2;

public class SingletonExam {

	public static void main(String[] args) {
		
		//컴파일 에러 > new 로 불러오면 안됨. 이미 싱글톤 형식으로 생성해주었기 때문에!!
//		SingletonHon obj1 = new SingletonHon();
//		SingletonHon obj2 = new SingletonHon();
		
		SingletonHon obj1 = SingletonHon.getInstance();
		SingletonHon obj2 = SingletonHon.getInstance();
		
			if(obj1== obj2) {
				System.out.println("같은 Sington 객체입니다.");
			}else {
				System.out.println("다른 Singleton 객체입니다.");
			}
		
		
	}

}
