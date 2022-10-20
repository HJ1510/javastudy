package chapter01;

public class Ex07ArithmaticOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		// binary operator
		System.out.println(a + b);  // 10
		System.out.println(a - b);  // -4
		System.out.println(a * b);  // 21
		System.out.println(a / b);  // 0
		System.out.println(a % 7);  // 3 
		
		// unary operator
		System.out.println(-a);  // -3
		++a; 
		// a = a + 1;          // 셋 다 같은 의미
		// a += 1;
		System.out.println(a); // 4
		
		a++;
		// a = a + 1;          // 셋 다 같은 의미
		// a += 1;
		System.out.println(a); // 5
	
		System.out.println(a++); // 5 a 출력 먼저 그 다음에 더하기
		// System.out.println(a); // 5
		// a = a + 1;
		System.out.println(a); // 6
		
		System.out.println(++a); // 7 더하기 먼저 하고 다음에 a값 출력 
		System.out.println(a); // 7
		
		System.out.println(--a); // 6
		System.out.println(a); // 6
		System.out.println(a++); // 6 
		System.out.println(a); // 7
	}
}
