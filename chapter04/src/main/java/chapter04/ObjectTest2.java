package chapter04;

public class ObjectTest2 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;

		// == : 두 객체의 동일성. 변수 안에 저장된 값을 비교
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		// equals : 두 객체의 동질성. 변수 안에 저장된 내용을 비교
		//			부모클래스 Object의 기본 구현은 동일성(==) 검토 .. 동질성을 검토하려면 오버라이딩 필요
		//
		System.out.println(p1.equals(p2)); 
		System.out.println(p2.equals(p3));

	}

}
