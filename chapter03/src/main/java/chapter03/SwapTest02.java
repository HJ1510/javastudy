package chapter03;

public class SwapTest02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + ":" + b);

//		int temp = a;
//		a = b;
//		b = temp;
		swap(a, b); // "call by value" vs. call by reference =stack에 쌓이는 인스턴스는 변경 x
		System.out.println(a + ":" + b);
	}

	public static void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}

}