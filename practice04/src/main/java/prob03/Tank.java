package prob03;

public class Tank extends Unit {
	// 현재 위치
	public Tank() {
		super.move(getX(), getY());
		super.stop();
	}
	void changeMode() {
		/* 공격모드를 변환한다. */
	}
}
