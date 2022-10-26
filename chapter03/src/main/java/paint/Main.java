package paint;

public class Main {

	public static void main(String[] args) {

		Point pt = new Point(10,50);
//		Point pt = new Point();
//		pt.setX(10);
//		pt.setY(50);
		
		drawPoint(pt);
		//pt.disappear();
		pt.show(false);
		
		ColorPoint pt2 = new ColorPoint();
		pt2.setX(100);
		pt2.setY(200);
		pt2.setColor("red");
		
		drawColorPoint(pt2);
	}
	
	public static void drawPoint(Point pt) {
		pt.show();
	}
	
	public static void drawColorPoint(ColorPoint pt) {
		pt.show();
	}

}
