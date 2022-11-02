package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// File I/O 상관없음
			File file = new File("phone.txt");
			if (!file.exists()) {
				System.out.println("file not found");
				return;
			}

			System.out.println("=====파일정보=====");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));

			System.out.println("=====전화번호=====");
			// 1. 기반스트림
			FileInputStream fs = new FileInputStream(file); //FileNotFoundException 필요없음 18-21라인에서 처리를 해줬기때문에.. IOException

			// 2. 보조스트림1
			InputStreamReader isr = new InputStreamReader(fs, "utf-8");

			// 3. 보조스트림2
			br = new BufferedReader(isr);

			// 4. 데이터 처리
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println("Error:" + ex);

		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
