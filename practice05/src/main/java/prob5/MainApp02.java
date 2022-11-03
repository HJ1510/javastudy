package prob5;

public class MainApp02 {

	public static void main(String[] args) {
		try {
			MyStack02 stack = new MyStack02(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(12);

			while (stack.isEmpty() == false) {
				// 위험! 잘못된 Type Casting을 할 우려가 있음
				// 1.작성시 에러가 발견되지 않음
				// 2.런타임때 ClassCastException이 발생할 가능성이 있음
				String s = (String)stack.pop(); //다운캐스팅(명시적)
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack02(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		} 
		catch ( MyStackException ex) {
			System.out.println( ex );
		}

	}

}
