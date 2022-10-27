package com.bitacademy.paint.point;

public class ColorPoint extends Point { // 상속에서 생성자!
	private String color;

	
	public ColorPoint(int x, int y, String color) {
		// this.x=x; // 오류! private으로 지정되어있기때문
//		setX(x); // 부모 생성자 명시하지 않았기때문에 기본생성자 super();가 먼저 호출됨
//		setY(y);
		super(x,y); // 부모 생성자 명시했기때문에 기본 생성자 호출x
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
//		System.out.println("점(x=" + x + ", y=" + y + ")을 그렸습니다."); // 부모클래스에서 x,y가 private이기때문에 x,y에 오류!
		System.out.println("점(x=" + getX() + ", y=" + getY() + ", color=" + color + ")을 그렸습니다.");
	}

}
