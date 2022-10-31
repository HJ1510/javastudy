package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		// String method들
		String s1 = "aBbABCabcAbc";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("abc", 7));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 5)); // 3~(5-1)까지

		String s2 = "   ab   cd   .   ";
		String s3 = "efg,hij,klm,nop,qrs";

		String s4 = s1.concat(s3);
		System.out.println(s4);
		System.out.println("--1" + s2.trim() + "1--"); // 양끝 공백제거
		System.out.println("--2" + s2.replaceAll(" ", "") + "2--"); //공백 모두 제거
		String[] tokens = s3.split(",");
		for (String s : tokens) {
			System.out.println(s);
		}
		System.out.println("---");
		String[] tokens2 = s3.split(" "); // spilt은 null값을 리턴하지 않음 자를 수 없으면 원본 출력
		for (String s : tokens2) {
			System.out.println(s);
		}

	}

}
