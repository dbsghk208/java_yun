package ch7_3;

//����Ŭ����
public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		
		System.out.println("-----");
	
	//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		
		//�ڵ� Ÿ�� ��ȯ �� �����ǵ� �޼ҵ� ȣ��
		animal = new Dog();
		animal.sound();
		
		//�ڵ� Ÿ�� ��ȯ �� �����ǵ� �޼ҵ� ȣ��
		animal = new Cat();
		animal.sound();
		
		System.out.println("-----");
		
	//�޼ҵ� ������
		//�Ʒ� animalSound(Animal animal) �޼ҵ�� �ڵ� Ÿ�� ��ȯ
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
									//�ڵ�Ÿ�Ժ�ȯ
	public static void animalSound(Animal animal) {
		animal.sound(); //�����ǵ� �޼ҵ� ȣ��
	}
	
}
