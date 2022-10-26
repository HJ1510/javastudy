package prob5;

public class Prob5 {

	public static void main(String[] args) {
//		for (int i = 1; i <= 99; i++) { //// 내가 푼 답
//			if ((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9) {
//				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) // 둘다 369에 해당
//					System.out.println(i + " 짝짝");
//				else
//					System.out.println(i + " 짝");
//			} else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
//				System.out.println(i + " 짝");
//		}
		
		for (int i = 1; i <= 100; i++) {
			String s = String.valueOf(i);

			int length = s.length();
			int clap = 0;

			for (int j = 0; j < length; j++) {
				char c = s.charAt(j);
				if (c == '3' || c == '6' || c == '9') {
					clap++;
				}
			}

			if (clap == 0) {
				continue;
			}

			System.out.print(s + " ");
			for (int j = 0; j < clap; j++) {
				System.out.print("짝");
			}

			System.out.print("\n");
		}
	}

}
