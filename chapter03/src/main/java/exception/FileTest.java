package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest { //#1

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {								//try구문은 가독성이 떨어짐
			fis = new FileInputStream("hello.txt");
			int data = fis.read();
			System.out.println((char) data);

		} catch (FileNotFoundException e) {
			System.out.println("erroe: " + e);
		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally { // 자원정리
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

//public class FileTest {
//
//	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("hello2.txt");
//			int data = fis.read();
//			System.out.println((char) data);
//		} catch (FileNotFoundException e) {
//			System.out.println("erroe: " + e);
//		} catch (IOException e) {
//			System.out.println("error: " + e);
//		} finally { // 자원정리
//			try {
//				if (fis != null) {
//					fis.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//}
