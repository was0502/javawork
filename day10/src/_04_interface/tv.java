package _04_interface;
/*
 * interface
  - 상속받을 때 키워드는 implements
  - 다중상속 가능
 */
// interface상속받을 때 키워드는 implements

public class tv implements RemoteControl /*, Inter, Face*/{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VALUE;
		else if(volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 음량 : " + volume);

	}

}
