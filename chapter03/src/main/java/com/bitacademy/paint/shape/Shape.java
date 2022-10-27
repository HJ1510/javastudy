package com.bitacademy.paint.shape;

import com.bitacademy.paint.i.Drawable;

public abstract class Shape implements Drawable {  // 추상메소드가 하나라도 있으면 추상 클래스 추상클래스는 객체구현 불가능
	private String lineColor;                      // Drawable에 있는 draw(); 상속
	private String fillCorlor;
	
	
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillCorlor() {
		return fillCorlor;
	}

	public void setFillCorlor(String fillCorlor) {
		this.fillCorlor = fillCorlor;
	}
	
//	public abstract void draw(); // abstract 추상
}
