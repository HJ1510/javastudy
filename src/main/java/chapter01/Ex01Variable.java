package chapter01;

public class Ex01Variable {

	public static void main(String[] args) {
		int i = 1000;
		String s = "Hello World";
		
		System.out.println(i);
		System.out.println(s);
		
		System.out.println("변수 변경(algorithm, logic)");
		
		i = 2000;
		s = "Hello again";
	
		System.out.println(i);
		System.out.println(s);	
		
		// 상수 관례상 대문자로 표시
		final double PI = 3.14; 
		System.out.println(PI);
		
		// 오류
		// final이 붙은 변수는 상수가 됨 => 다시 값을 대입하면 오류
		// pi = 5.68;

		System.out.println();
		
	}

}