package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;

		if (num % 2 == 0) { // num 짝수일때
			for (int i = 0; i <= num; i++) {
				if (i % 2 == 0) {
					sum = sum + i;
				}
			}
		} else { // num 홀수일때
			for (int i = 0; i <= num; i++) {
				if (i % 2 != 0) {
					sum = sum + i;
				}
			}

		}
		System.out.println(sum);

	}
}
