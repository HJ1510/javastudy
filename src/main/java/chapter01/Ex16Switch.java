
package chapter01;

public class Ex16Switch {

	public static void main(String[] args) {
		char grade = ' ';
		int score = 72;
		
		switch (score / 10) {
			case 10 : 
			case 9 : { // 90 <= score <= 99
				grade ='A';
				break;
			}
			case 8 : { // 80 <= score <= 89
				grade ='B';
				break;
			}
			case 7 : { // 70 <= score <= 79
				grade ='C';
				break;
			}
			case 6 : { // 60 <= score <= 69
				grade ='D';
				break;
			}
			default : { // score <= 59
				grade = 'F';
				break;
			}
		}
		System.out.println("학점은 " + grade + "입니다.");

	}
}

/**
 * if문 조건이 == 관계일때
 * if (a == 1) {
 * } else if (a == 2) {
 * } else if(a == 3) {
 * } else {
 * }
 * 
 * swtch문 활용 가능
 *swtch(a) {
	case 1: {
	 	break;
	}
	case 2: {
		break;
	}
	case 3: {
		break;
	}
	deafault: {
		break;
	}
}
 * 
 * 
 * 
 */
