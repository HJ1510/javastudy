package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);

//		Class klass = p.getClass();
//		System.out.println(klass);
		
		System.out.println(p.getClass()); // reflection 객체의 정보 반영 위 두줄과 같은의미
		
		System.out.println(p.hashCode()); // address 기반의 해싱값 address값 아님 reference값 아님
		System.out.println(p.toString()); // getClass()+"@+hashcode()
		System.out.println(p); // println이 기본적으로 toString 호출하는 기능 가지고 있음
		
		// 객체 비교 동일성 vs. 동질성

	}

}
