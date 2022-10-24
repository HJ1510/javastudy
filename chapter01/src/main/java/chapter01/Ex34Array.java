package chapter01;

public class Ex34Array {

	public static void main(String[] args) {
		int score1 = 90;
		int score2 = 100;
		int score3 = 80;
		int score4 = 70;
		int score5 = 80;
		int score6 = 90;
		int score7 = 50;
		int score8 = 60;
		int score9 = 30;
		int score10 = 80;
		
		int sum1 = score1+score2+score3+score4+score5+score6+score7+score8+score9+score10;
		float avg1 = sum1/10;
		System.out.println("평균: "+avg1);
		
		int[] scores = new int[] {90,100,80,70,80,90,50,60,30,80,100,90,40,50,80,90,45};
//		System.out.println(scores.length);
		int sum2 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum2 += scores[i];
		}
		float avg2 = sum2 / scores.length;
		System.out.println("평균: "+avg2);

	}

}
