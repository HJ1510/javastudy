package chapter01;

public class Ex33Array {

	public static void main(String[] args) {
		
		int[] intArray = new int[5]; 
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result = 0;
		for ( int i =0; i < intArray.length; i++ ){ //i <= intArray.length일때 에러
		     result = result + intArray[i];
		}
		System.out.println("result: "+result);
		//배열의 요소는 지정 안하면 초기화 되어있다.
		//정수, 실수는 0으로, 객체는 null로 초기화
		System.out.println("intArray의 4번째 값: " + intArray[3]);


	}

}
