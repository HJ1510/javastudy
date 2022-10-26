package chapter03;

public class StaticMethod {
	int n;
	static int m ;
	
	// StaticMethod 입력받은 값을 변경할 일이 없는 경우(불변 데이터를 활용) 객체 안의 값을 입력만 받고 변경x
	
	void f1() { // 클래스에서 필드(인스턴스)정보에 접근
		System.out.println(n);  
	}
	
	void f2() { // 클래스에서 변수에 접근
		System.out.println(StaticMethod.m);
		// 같은 클래스의 클래스(static) 변수접근에서는 클래스 이름 생략이 가능하다.
		System.out.println(m);
	}
	
	void f3() { 
		f2();
	}
	
	static void s1() {
		//오류: static method 에서는 인스턴스 변수에 접근 할 수 없다.
		//System.out.println(n);		
	}
	
	static void s2() {
		System.out.println(StaticMethod.m);
		// 같은 클래스의 클래스(static) 변수접근에서는 클래스 이름 생략이 가능하다.
		System.out.println(m);		
	}
	
	static void s3() {
		// 오류: static method 에서느 인스턴스 메소드에 접근할 수 없다.
		// f1();
	}
	
	static void s4() {
		StaticMethod.s1();
		// 같은 클래스의 클래스(static) 메소드 접근에서는 클래스 이름 생략이 가능하다.
		s1();
	}
}
