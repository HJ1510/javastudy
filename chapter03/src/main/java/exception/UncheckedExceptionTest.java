package exception;

public class UncheckedExceptionTest {

	public static void main(String[] args) {

		// Unchecked Exception은 예외처리 없이 발생해야한다.
		// 왜? 예외를 보고 수정해야 하는 로직 에러이기때문에(엄밀한 의미에서 예외 아님)
		// ArrayIndexOutOfBoundsException
		// ArismeticException
		// NullPointException
//		try {
		int[] a = { 1, 2, 3, 4, 5 };
		
		System.out.println(a[0]);
		System.out.println(a[5]);

		for (int i = 0; i <= 5; i++) {
			System.out.println(a[i]);
		}
//		} catch (Exception ex) {
//			System.out.println("error!");
//		}

	}

}
