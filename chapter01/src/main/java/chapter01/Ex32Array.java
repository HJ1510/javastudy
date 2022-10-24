/**
 * new 배열은 같은 타입의 값들만 모여있음+순서 有 [] 데이터 값을 저장할 수 있는 공간과 그 크기를 지정하는 것
 * 일반 변수는 초기화가 필요하지만 배열은 생성시에 이미 초기화가 되어있음
 * class는 다른 타입의 값들이 섞여있을 수 있음 하나의 클래스 자체가 일종의 데이터 타입을 새로 정의하는 것
 * 
 * 
 * 1. int a = 10
 * 2. int[] a = new int[3];
 * 		a[0]=10
 * 3. Student s = new Student();
 * 		
 */

package chapter01;

public class Ex32Array {

	public static void main(String[] args) {
		// 배열 변수 선언시 크기를 지정할 수 없다.
		// int[10] a1; // 오류 남
		
		int[] a2 = new int[5]; // int a2[] = new int[5]; 와 같은 의미 하지만 후자는 비추(실제로 활용하는 경우 거의 없음) 
		System.out.println(a2.length); // length 는 attribute임 함수 아님
		a2[0] = 10;
//		System.out.println(a2[0]);
//		System.out.println(a2);
		
		//초기화1
		int[] a4 = {0,1,2,3,4}; // new가 바로 적용되어 있는 것 배열의 값을 다 알고 있을때 활용
		System.out.println(a4.length);
		
		//초기화2 = 초기화1과 같음 **활용 빈도 높음
		int[] a5 = new int[5];
		a5[0] = 0;
		a5[1] = 1;
		a5[2] = 2;
		a5[3] = 3;
		a5[4] = 4;
		System.out.println(a5.length);
		
		//초기화3
		int[] a6 = new int[]{0,1,2,3,4};
		System.out.println(a6.length);
		
		//사용: 1.랜덤 접근
		System.out.println(a6[4]);
		
		//사용: 2.순회
		for(int i = 0; i < a6.length; i++) {
			System.out.println(a6[i]+" ");
		}

	}

}
