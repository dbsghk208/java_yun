package ch8_1;

public interface RemoteControl {
	//���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	//�޼ҵ� ����θ� �ۼ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
}
