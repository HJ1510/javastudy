package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		printDate01(now);
		printDate02(now);

	}

	private static void printDate01(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(d);
		String date2 = sdf2.format(d);
		System.out.println(date);
		System.out.println(date2);

	}

	private static void printDate02(Date d) { // calender 사용할 것 추천
		// 년도(+1900)
		int year = d.getYear();

		// 월 (0~11) +1
		int month = d.getMonth();

		// 일
		int date = d.getDate();

		// 시
		int hours = d.getHours();

		// 분
		int minutes = d.getMinutes();

		// 초
		int seconds = d.getSeconds();

		System.out.println(
				(year + 1900) + "-" + (month + 1) + "-" + (date) + " " + hours + ":" + minutes + ":" + seconds);
	}
}