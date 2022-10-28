package prob03;

public class test {

	public static void main(String[] args) {
		Tank t1=new Tank();
		t1.move(10, 20);
		System.out.println(t1.getX());
		System.out.println(t1.getY());
		t1.stop();
		System.out.println(t1.getX());
		t1.move(20, 30);
		System.out.println(t1.getX());
	}

}
