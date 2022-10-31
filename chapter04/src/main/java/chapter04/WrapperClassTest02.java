package chapter04;

import javax.print.DocFlavor.STRING;

public class WrapperClassTest02 { // 기본값들을 객체로 사용 일반 기본타입과 사용방법 같음 연산식 사용 가능

	public static void main(String[] args) {
		String s1 = "123456";
		int i = Integer.parseInt(s1);
		System.out.println(i + 1);
		System.out.println(s1 + 1);
		System.out.println("-----");

		// cf1 반대로
		String s2 = String.valueOf(i);
		// cf2 반대로
		String s3 = "" + i;
		System.out.println(s1 + ":" + s2 + ":" + s3);
		System.out.println("-----");

		char c = 'A';
		int i2 = Character.getNumericValue(c);
		System.out.println(i2);

		// 2진수
		String s4 = Integer.toBinaryString(15);
		System.out.println(s4);

		// 16진수
		String s5= Integer.toHexString(15);
		System.out.println(s5);
	}

}
