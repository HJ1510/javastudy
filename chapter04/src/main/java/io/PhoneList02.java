package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) throws FileSystemNotFoundException {
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

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String name = scanner.next();
				String phone01 = scanner.next();
				String phone02 = scanner.next();
				String phone03 = scanner.next();

				System.out.println(name + ":" + phone01 + "-" + phone02 + "-" + phone03);
			}
			scanner.close();
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