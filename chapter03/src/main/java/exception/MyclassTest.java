package exception;

import java.io.IOException;

public class MyclassTest {

	public static void main(String[] args) {
		
		try {
			MyClass myClass = new MyClass();
			myClass.danger();
		} catch (MyException e) {
			System.out.println("error: "+e);
		}

	}

}
