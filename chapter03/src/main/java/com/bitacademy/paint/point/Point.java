package com.bitacademy.paint.point;

import com.bitacademy.paint.i.Drawable;

public class Point implements Drawable {
	private int x;
	private int y;
	
	public Point() {
		System.out.println("----");
	}
	
	public Point(int x, int y) { // 생성자가 하나라도 있으면 기본생성자 자동으로 생성해주지 않음
		this.x=x;
		this.y=y;
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
	
	public void show(boolean visible) {
		if(visible) {
			show();			
		} else {
			System.out.println("점(x=" + x + ", y=" + y + ")을 지웠습니다.");
		}
	}
	public void show() {
		System.out.println("점(x=" + x + ", y=" + y + ")을 그렸습니다.");	// 오버로딩 하나의 클래스에서 시그너처가 다른 메소드
	}

	@Override
	public void draw() {
		show();
	}
	
//	public void disappear() {
//		System.out.println("점(x=" + x + ", y=" + y + ")을 지웠습니다.");	
//	}

}
