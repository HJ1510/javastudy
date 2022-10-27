package tv;

public class WatchTV {

	public static void main(String[] args) {
		TV tv = new TV(7, 20, false); // 생성자

		tv.status();

		tv.power(true); //on 오버로드
		tv.volume(120); //디지털 볼륨 100을 넘어가면 0으로
		tv.status();

		tv.volume(false); //100 볼륨 한개씩 조절 0-1=>100 순환되도록 
		tv.status();

		tv.channel(0);
		tv.status(); // 255

		tv.channel(true); //+
		tv.channel(true); //+
		tv.channel(true); //+
		tv.status();

		tv.power(false); //off
		tv.status();

	}

}
