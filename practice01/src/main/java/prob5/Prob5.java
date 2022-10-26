package prob5;

//import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
//		for(int count = 1; count < 100; count++) {
//			String number = String.valueOf(count);
//			for(int i=1; i<100; i++) {		
//				char num = number.charAt(i);
//				if(num == '3'||num == '6'||num == '9') {
//					System.out.println(i+" 짝");
//				}
//			}
//		}	
		for (int i = 1; i <= 99; i++) {
			if ((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9) {
				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) // 둘다 369에 해당
					System.out.println(i + " 짝짝");
				else
					System.out.println(i + " 짝");
			} else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
				System.out.println(i + " 짝");
		}
	}

}
