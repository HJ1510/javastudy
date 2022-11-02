package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);
		
		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}
	
	public static char[] reverse(String str) {
		char[] cs= str.toCharArray();
		for (int i =0, j =str.length(); i< j; i++, j--) {
			char cs1=cs[i];
			cs[i]=cs[j];
			cs[j]=cs1;			
		} 				
		return cs;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println(array);
	}
}