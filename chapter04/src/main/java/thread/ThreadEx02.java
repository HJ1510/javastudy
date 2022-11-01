package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadEx02 {

	public static void main(String[] args) {
		List list = new ArrayList(); // <> 설정 안하면 기본적으로 object로 인식.. 명시하는것이 좋음

		Thread thread1 = new DigitThread();
		Thread thread2 = new AlphabetThread();

		thread1.start();
		thread2.start();

	}

}
