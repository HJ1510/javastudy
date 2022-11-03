//package prob01; // 오버로드
//
//public class Printer {
//	public Printer() {
//	}
//
//	public void println(int i) {
//		System.out.println(i);
//	}
//
//	public void println(boolean b) {
//		System.out.println(b);
//	}
//
//	public void println(double d) {
//		System.out.println(d);
//	}
//
//	public void println(String s) {
//		System.out.println(s);
//	}
//
//}

package prob01;

public class Printer {

//	public <T> void println(T t) {
//		System.out.println(t); // 변수타입을 호출할때(런타임때) 결정한다 동적타이핑
//	}

	
	public <T> void println(T... ts) {
		for(T t : ts) {
			System.out.println(t);
		}
	}

	public int sum(int... nums) { // ... 가변파라미터
		int sum = 0;
		for (int i : nums) {
			sum = sum + i;
		}
		return sum;
	}

//	public <T, R, S>=>리턴 타입 아님 제너릭임을 표시해주는것 R println(T t, S a) {
//		R result=null;
//		return result;
//		
//	}

}
