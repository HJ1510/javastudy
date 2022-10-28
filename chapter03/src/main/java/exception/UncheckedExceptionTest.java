package exception;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 4, 5 };
//
//		for (int i = 0; i < 5; i++) { // i = 4인 경우 예외 발생
//			System.out.println(a[i]);
//			System.out.println("error1");
//
//			try {
//				i = 4;
//				System.out.println("error2");
//
//			} catch (ArithmeticException e) {
//				System.out.println("error3");
//			}
//		}

		// Unchecked Exception은 예외처리 없이 발생해야한다.
		// 왜? 예외를 보고 수정해야 하는 로직 에러이기때문에(엄밀한 의미에서 예외 아님)
		// ArrayIndexOutOfBoundsException
		// ArismeticException
		// NullPointException 
		try {
			int[] a = { 1, 2, 3, 4, 5 };

			for (int i = 0; i <= 5; i++) {
				System.out.println(a[i]);
			}
		} catch (Exception ex) {
			System.out.println("error!");
		}

	}

}
