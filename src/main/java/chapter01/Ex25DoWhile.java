/** do while => 일단 do 구문을 한번 하고 나서 while에 들어감
 * do{
 * } while(조건문);
 * 
 */

package chapter01;

public class Ex25DoWhile {

	public static void main(String[] args) {
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
		} while(i < 3);
	}
}
