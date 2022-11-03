package prob5;

public class MainApp03 {

	public static void main(String[] args) {
		try {
			MyStack03<String> stack = new MyStack03(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
//			stack.push(12); String만 넣을 수 있음

			while (stack.isEmpty() == false) {
				String s = stack.pop(); // 캐스팅으로 타입 지정 안해도 되도록 수정
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack03<>(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		} 
		catch ( MyStackException ex) {
			System.out.println( ex );
		}

	}

}
