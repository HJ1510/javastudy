package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;

		try {
			// 기반 스트림
			FileOutputStream fos = new FileOutputStream("test.txt");

			// 보조 스트림 : 소스를 알아야 할 필요x 주스트림 객체에 의존성을 가지고 있음(주스트림이 없으면 작동x)
			bos = new BufferedOutputStream(fos);

			for (int i = 97; i <= 122; i++) { // for (int i = 'a'; i <= 'z'; i++) 아스키코드 a=97 z=122
				bos.write(i); // IOException 설정 필요
			}

		} catch (FileNotFoundException e) {
			System.out.println("Can't Open: " + e);
		} catch (IOException e) {
			System.out.println("Error: " + e);
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
