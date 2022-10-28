package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);

//		Class klass = p.getClass();
//		System.out.println(klass);
		
		System.out.println(p.getClass()); // reflection 위 두줄과 같은의미
		
		System.out.println(p.hashCode());
		System.out.println(p.toString());

	}

}
