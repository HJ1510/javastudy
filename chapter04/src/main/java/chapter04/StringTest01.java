package chapter04;

public class StringTest01 {

	public static void main(String[] args) {
		// c:\temp
		System.out.println("c:\temp");
		System.out.println("c:\\temp");
		System.out.println("------------");

		// "hello"
		// System.out.println(""hello"");
		System.out.println("\"hello\"");
		System.out.println("------------");

		// \t: tab
		// \r: carriage return 커서를 맨앞으로 땡기는것
		// \n: new line 개행 \r + \n줄바꿈
		// \b: beep
		// \+알파벳 한개는 출력을 제어 제어문자

		System.out.print("hello world\n");
		System.out.print("hello world");
		System.out.print("\n");
		System.out.println("------------");
		System.out.print("hello world");
		System.out.print("hello world");
		System.out.print("\n");
		System.out.println("------------");

		// '
		// char c=''';
		char c = '\'';
		System.out.println(c);
	}

}
