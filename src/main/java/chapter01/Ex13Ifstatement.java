package chapter01;

public class Ex13Ifstatement {

	public static void main(String[] args) {
		char grade = ' ';
		int score = 72;
		
		if (score >= 90) {
			grade ='A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		
//		if (score >= 70) {
//			System.out.println("참 잘했어요.");
//		} else {
//			System.out.println("좀 더 노력하세요.");
//		}
		

	}

}
