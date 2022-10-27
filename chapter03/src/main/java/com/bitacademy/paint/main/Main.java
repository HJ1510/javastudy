package com.bitacademy.paint.main;

import com.bitacademy.paint.i.Drawable;
import com.bitacademy.paint.point.ColorPoint;
import com.bitacademy.paint.point.Point;
import com.bitacademy.paint.shape.Circle;
import com.bitacademy.paint.shape.Rectangle;
import com.bitacademy.paint.shape.Shape;
import com.bitacademy.paint.shape.Triangle;
import com.bitacademy.paint.text.GraphicText;

//import java.util.ArrayList; // java.util.=> 패키지 이름 ArrayList=>클래스 이름
//import java.util.LinkedList;
//import java.util.*;

public class Main {

	public static void main(String[] args) {

		
		Point pt = new Point(10, 50);
//		Point pt = new Point();
//		pt.setX(10);
//		pt.setY(50);

//		drawPoint(pt);
		draw(pt); // 업캐스팅
		// pt.disappear();
		pt.show(false);

//		ColorPoint pt2 = new ColorPoint();
//		Point pt2 = new ColorPoint(100, 200, "red"); // 부모클래스(Point)의 메소드 참조 => 오버라이딩( 한 클래스 내에서는 오버라이딩이 나오지 않음.. 부모 메소드 무시)
//		pt2.setX(100); // 변수 세팅은 setter와 생성자 두가지로 가능
//		pt2.setY(200);
//		((ColorPoint) pt2).setColor("red"); // downcasting
		Point pt2 = new ColorPoint(100, 200, "red");

//		drawPoint(pt2); // 수정없이 부모클래스에서 기존에 있는 메소드를 씀(같은 이름, 같은 시그너처.. )
		draw(pt2);
		pt2.show(false);
//		pt2.show(true);

		Triangle triangle = new Triangle();
		// drawTriangle(triangle);
//		drawShape(triangle); // 업캐스팅	
		draw(triangle);

		Rectangle rectangle = new Rectangle();
//		drawShape(rectangle);
		draw(rectangle);

		Circle circle = new Circle();
//		drawShape(circle);	
		draw(circle);

		GraphicText gt = new GraphicText("Hello World");
		draw(gt);

		// instanceof test
		System.out.println(circle instanceof Object); // true
		System.out.println(circle instanceof Shape); // true
		System.out.println(circle instanceof Circle); // true
//		System.out.println(circle instanceof Rectangle); // 오류! class는 hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있다. 
//		System.out.println(circle instanceof String); // 오류!
		// 하지만 interface는 hierachy와 상관없이 instanceof 연산자 사용 가능
		System.out.println(circle instanceof Drawable); // true
		System.out.println(circle instanceof Runnable); // false Runnable은 구현하지 않았음

	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}

//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}	

//	public static void drawPoint(Point pt) {
//		pt.show();
//	}

//	public static void drawColorPoint(ColorPoint pt) { // 상속을 활용하면 필요가 없는 메소드임
//		pt.show();
//	}

//	public static void draw(Triangle triangle) {
//		triangle.draw();
//	}

}
