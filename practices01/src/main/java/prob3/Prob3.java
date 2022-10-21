package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
				
		while(true) {
			if(num % 2 == 1) { //홀수일때
				sum=sum+num;
				System.out.println(sum);
				break;
			} else if(num % 2 == 0) { //짝수일때
				sum=sum+num;
				System.out.println(sum);
				break;
			}
			num++;
			
			
		}	
	}
}
