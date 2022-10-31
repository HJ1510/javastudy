package chapter04;

public class StringTest04 {

	public static void main(String[] args) {
		String s = "Hello " + "World " + "java " + 12;
		String s1= new StringBuffer("Hello ").append("World ").append("Java ").append(12).toString();

		System.out.println(s);
		System.out.println(s1);

//		String s2 = "";
//		for (int i = 0; i <= 1000; i++) { 
//			s2 += i; //String +연산을 계속하면 메모리 사용량이 늘어남
////			s2 = new StringBuffer(s2).append(i).toString();
//		}
//		System.out.println(s2);

		StringBuffer sb2 = new StringBuffer("");
		for (int i = 0; i <= 100000; i++) {
			sb2.append(i);
		}
		String s2 = sb2.toString();
		System.out.println(s2.length());
	}

}
