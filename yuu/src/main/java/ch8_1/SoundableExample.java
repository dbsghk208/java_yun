package ch8_1;


//Dog�� Cat Ŭ������ ����ᰡ�� ����ϴ� Ŭ����

public class SoundableExample {

	private static void printSound(Soundable soundable) {
							//�������̽� Ÿ���� �Ű� ������ ������ �ִ�.
		
		System.out.println(soundable.sound());
	}
		
	public static void main(String[] args) {
		printSound(new Dog());
		printSound(new Cat());
	}

}
