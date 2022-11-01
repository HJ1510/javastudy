package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadEx02 {

	public static void main(String[] args) {
		List list = new ArrayList();

		Thread thread1 = new DigitThread();
		Thread thread2 = new AlphabetThread();

		thread1.start();
		thread2.start();

	}

}
