package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		/* 코드 작성 */
		System.out.print("금액: ");
		int price = scanner.nextInt();
//		int won50000 = price / MONEYS[0];
//		int won10000 = price % MONEYS[0] / MONEYS[1];
//		int won5000 = price % MONEYS[0] % MONEYS[1] / MONEYS[2];
//		int won1000 = price % MONEYS[0] % MONEYS[1] % MONEYS[2] / MONEYS[3];
//		System.out.println("50000원 : "+won50000+"개"+"\n"+"10000원 : "+won10000+"개"
//							+"\n"+"5000원 : "+won5000+"개"+"\n"+"1000원 : "+won1000+"개");
		for(int i = 0; i<MONEYS.length; i++) {
			System.out.println(price/MONEYS[i]);
		}
		scanner.close();
		
 	}
}