package prob03;

public class Unit {
	// 현재 위치
	private int x;
	private int y;

	public void move(int x, int y) {
		/* 지정된 위치로 이동 */
		this.x=x;
		this.y=y;
	}

	public void stop() {
		/* 현재 위치에 정지 */
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
