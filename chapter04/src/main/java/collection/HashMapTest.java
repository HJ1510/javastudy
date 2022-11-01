package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		String ks1 = "one";
		m.put(ks1, 1);
//		m.put("one", 1); // auto boxing
		m.put("two", 2);
		m.put("three", 3);

		int i = m.get("one"); // auto unboxing
		int j = m.get(new String("two"));
		System.out.println(i + ":" + j);

		m.put("three", 33333);
		System.out.println(m.get("three"));

		// 순회
		Set<String> s = m.keySet(); //간접적으로 순회
		for(String key:s) {
			System.out.println(m.get(key));
		}
		
		System.out.println("========");
		
		Map<String, Object> o = new HashMap<>();
		
		o.put("1", 1);
		System.out.println(o);
	}

}
