package chapter01;

public class Ex12BitwiseOperator {

	public static void main(String[] args) {
		int a = 0x0f;
		int b = 0xf0;
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a); // 0은 1로 1은 0으로
		System.out.println(a >> 3);
		System.out.println(a << 3);	
	}
}


//연산자 우선 순위
//++, --
//1. 산술 연산자 * / % + -
//2. 비교 연산자 == != > < >= <=
//--비트 연산자--
//3. 논리 연산자 && || ^
//1 > 10 -9 && 'a' == 'b'
//=>(1 > (10 -9)) && ('a' == 'b')
