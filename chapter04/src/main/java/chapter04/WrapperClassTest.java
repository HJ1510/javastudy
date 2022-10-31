package chapter04;

public class WrapperClassTest {

	public static void main(String[] args) {
		// 이런 방식으로 사용 xxxxxxxx
		Integer i1 = new Integer(10);
		Character c1 = new Character('c');
		Boolean b1 = new Boolean(true);
		
		// Auto Boxing // 없으면 new 있으면 기존에 있던 레퍼런스값 가져옴
		Integer i2 = 10;
		Integer i3 = 10;
		Long l = 10L;
		System.out.println(i2.equals(10)); // auto boxing
//		System.out.println(i2.equals(new Integer(10)));
		System.out.println("---");

		// Auto Unboxing
		System.out.println(i2 == 10);
		System.out.println(i2.intValue() == 10);
		System.out.println("---");

		int m = i1 + 10;
//		int m = i2.intValue() + 10;
		System.out.println(m);

	}

}

//Wrapper Class
//값을 특정할 수 없는 객체를 값으로 다룰 때
//불변 like String