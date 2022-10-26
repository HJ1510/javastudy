package tv;

public class TV {
	private int channel; // 1~255 범위 벗어나면 라운딩 시킬것
	private int volume; // 0~100 범위 벗어나면 라운딩 시킬것
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void status() {
		System.out.println("TV[channel=" + channel + ", volume=" + volume + ", power=" + (power ? "ON" : "off") + "]");

	}

	public void power(boolean power) {
		this.power = power;
	}

	public void volume(int volume) {
		this.volume = volume;
	}
	
	public void volume(boolean b) {
		if(b!=true) {
			volume--;
		}
	}

	public void channel(int channel) {
		this.channel = channel;
		if (channel <= 0) {
			channel = 255;
		}
	}

	public void channel(boolean b) {
		if(b=true) {
			channel++;
		}
		
	}
	

}
