package chapter01;

/**
 * 리터럴(Literal)이란 프로그램에 직접적으로 표현되는 상수이다.
 * 
 *  
 */
public class Ex02Literal {

	public static void main(String[] args) {
		float f = 3.14f; //숫자 뒤에 f로 명시
		double d = 3.14;
		
		short s = 1;
		int i = 1;
		long l = 12345678901234456L; //숫자 뒤에 l로 명시
		
		char c ='A';
		byte b = 65;
		
		boolean bool = true;
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(c);
		System.out.println(b);
		System.out.println((char)b);
		
		System.out.println(bool);
		
	}

}
