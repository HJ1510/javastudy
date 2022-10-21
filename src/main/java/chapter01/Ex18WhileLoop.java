/** for loop / while loop
 * 1
 * for(조건식) {
 * }
 * 
 * 2
 * while(조건식) {
 * }
 * 
 * 3
 * do{
 * 
 * } while(...);
 *
 *
 * while(1-1==0){
 * } => infinite loop
 */


package chapter01;

public class Ex18WhileLoop {

	public static void main(String[] args) {
		// 1.loop 조건 변수
		int i = 0;
		
		// 2.while loop의 조건식
		while(i < 10) {
			// 3.반복되는 코드
			System.out.println(i);
			// 4.loop 조건 변경
			i = i+1; // i+=1 i++
		}
	}
}


