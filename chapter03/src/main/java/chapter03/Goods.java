package chapter03;
//정보은닉
public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
		
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





	public String toString() {
		return "Goods [name=" + name + ", price=" + price + 
				", countStock=" + countStock + ", countSold=" + countSold + "]";
	}
	
//	public void setName(String name) {
//	this.name = name; //this는 runtime때 실행중인 객체를 내부에서 접근할때 필요
//  }
	
//	public String getName() {
//		return name;
//	}

}
