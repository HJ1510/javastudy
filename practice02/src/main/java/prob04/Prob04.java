package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);
		
//		char[] c2 = reverse("Java Programming!");
//		printCharArray(c2);
	}
	
	public static char[] reverse(String str) {
		char[] cs = str.toCharArray();
		
		/* 코드를 완성합니다 */
		for(int i=0, j =cs.length-1; i<cs.length; i++,j--) {
//			System.out.println(cs[i]);
			char[] cs2 = cs;
//			System.out.println(cs2[cs.length-1]);
			cs[i]=cs2[j];

			System.out.println(cs[i]);
			} 
		
			
		return cs;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
//		System.out.println(array);
	}
}