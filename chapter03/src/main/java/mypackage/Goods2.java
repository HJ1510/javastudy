package mypackage;

public class Goods2 {
	public String name; // 모든 접근이 가능하다.
	protected int price; // 같은 패키지에서 접근 가능 + "자식에서 접근 가능"
	int countStock; // default 같은패키지
	private int countSold; // class 내부에서만 접근 가능

	public void m() {
		countSold = 100;
	}
}
