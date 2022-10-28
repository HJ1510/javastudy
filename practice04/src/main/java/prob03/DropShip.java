package prob03;

public class DropShip extends Unit {

	public DropShip() {
		super.move(getX(), getY());
		super.stop();
	}
	
	void load() {
		/* 선택된 대상을 태운다.*/ 
	}
	
	void unload() {
		/* 선택된 대상을 내린다.*/ 
	}
}