package prob03;

public class Marine extends Unit {
	public Marine() {
		super.move(getX(), getY());
		super.stop();
	}
	
	void stimPack() { 
		/* 스팀팩을 사용한다.*/
	}	
}
