package ch2;

public class SingletonHon {

	private static SingletonHon singleton = new SingletonHon();
	
	
	private SingletonHon() {}


	static SingletonHon getInstance() {
		return singleton;
		
	}
}
