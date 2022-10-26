package chapter03;

//정보은닉
public class Goods {
	public static int countOfGoods = 0;

	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public Goods() {
		countOfGoods++; // Goods.countOfGoods++;=> 같은 클래스 안에서 Goods.생략가능
	}

	// 생성자
	public Goods(String name, int price, int countStock, int countSold) {
		this(); // countOfGoods++; 불러옴
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;

//		countOfGoods++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

//	public String toString() {
//		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
//				+ "]";
//	}

	public void showInfo() {
		System.out.println("Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold="
				+ countSold + "]");
	}

	public int calcDiscountPrice(double discountRate) {
		return (int) (price * discountRate);
	}

//	public void setName(String name) {
//	this.name = name; //this는 runtime때 실행중인 객체를 내부에서 접근할때 필요
//  }

//	public String getName() {
//		return name;
//	}

}
