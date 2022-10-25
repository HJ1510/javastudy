package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		while( true ) {
			
			/* 게임 작성 */
			

			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
//			System.out.println(correctNumber);
			System.out.println("수를 결정 하였습니다. 맞추어보세요."+"\n"+"1-100");
			
			int i = 1 ;
			int min = 1;
			int max = 100;
			while(true) {
				System.out.print(i + ">>");
				int answer = scanner.nextInt();
				if(answer == correctNumber) {
					break;
				} else if(answer > correctNumber) {
					max=answer;
					System.out.println("더 낮게"+"\n"+min+"-"+max);
				} else if(answer < correctNumber) {
					min=answer;
					System.out.println("더 높게"+"\n"+min+"-"+max);
				}
				i++;
			}

			
			//새 게임 여부 확인하기
			System.out.print("맞았습니다.\n"+"다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
		}
		
		scanner.close();
	}

}