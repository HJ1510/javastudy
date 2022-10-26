package tv;

public class TV {
	private int channel; // 1~255 범위 벗어나면 라운딩 시킬것
	private int volume; // 0~100 범위 벗어나면 라운딩 시킬것
	private boolean power;
	
	
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
		System.out.println("TV{channel=]"+channel+", volume="+ volume +", power="+(power ? "ON":"off")+"]");
		
	}
	
	
}
