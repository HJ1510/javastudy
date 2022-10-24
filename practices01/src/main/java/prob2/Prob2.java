package prob2;

public class Prob2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
			for (int j = i+1 ; j <= i+9; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}
}
