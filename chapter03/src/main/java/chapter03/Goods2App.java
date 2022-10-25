package chapter03;

import mypackage.Goods2;

public class Goods2App {

	public static void main(String[] args) {
		Goods2 g = new Goods2();

		// public은 접근 제한이 없다 (내/외부 자식 등 다 접근 가능) 메소드는 거의 public으로 작성
		g.name = "camera";
		
		// protected는 같은 패키지에서 접근이 가능하다
		// 더 중요한 것은 자식에서도 접근이 가능하다
		// g.price = 1000;

	}

}
