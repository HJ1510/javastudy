package chapter01;

public class Ex03Typecast {

	public static void main(String[] args) {
		int i1 = 10;
		long l1 = 10000L;
		
		float f1 = 3.14f;
		double d1 = 3.14;
		
		// 명시적 자료 유형 변환 (explicit casting)
		int i2 = (int)l1; // 큰 값을 작은 값으로 변경시에 오류 생김 그래도 변경하려면 명시를 해야함
		float f2 = (float)d1;
		int i3 = (int)f1;
		
		// 암시적 자료 유형 변환 (implicit casting)
		long l2= i1; // 작은 값을 큰 값으로 변경시에는 오류 생길 일이 없음 명시 안해도 됨
		double d2 = f1;
		double d3 = i1;
		
		// 데이터의 의미가 다르면 캐스팅 자체가 안됨
		// boolean b = (boolean)i1; 
		
		System.out.println(i2);
		System.out.println(f2);
		System.out.println(i3);
		System.out.println(l2);
		System.out.println(d2);
		System.out.println(d3);
	}

}
