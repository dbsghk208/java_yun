package ch8_1;

//�������̽� ������ ������ü ����
public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;   //SmartTelevision ��ü�� �������̽� Ÿ�Ժ����� ���� ���� 
		Searchable searchable = tv;    //SmartTelevision ��ü�� �������̽� Ÿ�Ժ����� ���� ���� 

	}

}
