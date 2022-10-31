package chapter04;

import java.util.HashSet;
import java.util.Set;

/* 자바 제공 자료구조 클래스 = collection framework // 자료구조는 !내용!이 중요
 * List 순서 o, 중복 x
 * Map 마치 like python dict..
 * Set 순서 x, 중복x =>HashSet 
 */

public class HashSetTest {

	public static void main(String[] args) {
		Set<Rect> set = new HashSet<>();

		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(10, 20);

		set.add(r1);
		set.add(r2);

		for (Rect r : set) {
			System.out.println(r);
		}
	}

}