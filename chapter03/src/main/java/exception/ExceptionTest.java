package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;

		System.out.println("some code1");

		try {
			System.out.println("some code2");
			int result = (1 + 2 + 3) / b;
			System.out.println("some code3");
		} catch (ArithmeticException ex) {
			/* 예외 처리 */ // 비워두면 안됨!!!!! 내용은 회사마다 다름
			// 1. 사과
			System.out.println("죄송합니다.");

			// 2. 로깅
			System.out.println("err: " + ex);

			// 3. 정상종료
//			System.exit(0);
			return;
		} finally { // 예외 발생 - 정상 실행 어느경우에도 반드시 실행되는 블록 보통 자원 정리에 쓰임
			System.out.println("자원 정리");
		}
		// 예외가 발생한 이후에 실행되는 코드이기때문에 비추
		// (예외처리 후에는 코드 작성하지 않는 것이 좋음. 예외가 발생했지만 실행되기때문에)
//		System.out.println("some code4");
	}

}
