package sec01.exam04;
import sec01.exam01.*;

public class Audio implements RemoteControl{
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MAX_VOLUME) {
			this.volume=volume;
		}else {
			this.volume=volume;
		}
		System.out.print("현재 Audio 볼륨: " + this.volume);
	}

}
