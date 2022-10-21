package chapter01;

public class Ex30Gugudan2 {

	public static void main(String[] args) {
		//System.out.println("1 X 1 = 1");
		//System.out.println("1 X 1 = 1");
//		
//		System.out.print("1 X 1 = 1");
//		System.out.print("\n");
//		System.out.print("1 X 1 = 1");
//		System.out.println("");
//		System.out.print("1 X 1 = 1");
//		System.out.print("\t");
//		System.out.print("1 X 1 = 1");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(j +" X "+ i + " = "+ j*i);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
}