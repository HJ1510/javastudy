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
	}
	
	public static void drawPoint(Point pt) {
		pt.show();
	}

}
