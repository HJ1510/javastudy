package chapter01;

public class Ex11LogicalOperator {

	public static void main(String[] args) {
		// ! (not)
		// ! (true) => false
		// ! (false) => true
		System.out.println(!(3 != 2)); // false
		
		// &&(and, 논리곱) // true=1 false=0처럼 취급
		// true and false => false
		// false and false => false
		// true and true => true
		System.out.println((3 > 2) && (3>4)); // false
		
		// ||(or, 논리합)
		// true || false => true
		// false || true => true
		// false || false => false
		// true || true => true
		System.out.println((-1 > 0)||(3 != 2)); // true
				
		// ^ (xor, 배타적 논리합) 다르면 true, 같으면 false
		// true ^ false => true
		// false ^ true => true
		// false ^ false => false
		// true ^ true => false
		System.out.println(3 != 2 ^ -1 > 0); //true
	}
}
