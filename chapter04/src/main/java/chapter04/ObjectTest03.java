package chapter04;

public class ObjectTest03 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + " : " + s2.hashCode());
		System.out.println(System.identityHashCode(s1) + " : " + System.identityHashCode(s2));

		System.out.println("========================");

		String s3 = "hello";
		String s4 = "hello"; // string literal은 new를 선택적으로... 같은 해시코드를 가진 객체가 있을 경우 새로 만들지 않고 기존에 있던 객체를 사용 <=불변
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + " : " + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + " : " + System.identityHashCode(s4));

	}

}
