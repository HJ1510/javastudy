package chapter04;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// new Calender 사용 x 생성자가 private임
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal); // 포맷팅 or 개별적으로 뽑아 사용
		printDate(cal);

		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 11); // 12월 Month-1
		cal.set(Calendar.DATE, 25);
		printDate(cal);

		cal.set(1988, 8, 20);
		cal.add(Calendar.DATE, 10000);
		printDate(cal);
	}

	private static void printDate(Calendar cal) {
		final String[] DAYS = { "일", "월", "화", "수", "목", "금", "토" };
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // 0~11 -1셋팅 필요
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK); // 1(일)~7(토)
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.println((year) + "-" + (month + 1) + "-" + (date) + " " + DAYS[day - 1] + " " + hour + ":" + minute
				+ ":" + second);
	}

}
