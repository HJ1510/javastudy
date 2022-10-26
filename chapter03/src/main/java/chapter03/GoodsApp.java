package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods(); // camera=>변수 new Goods()=>기본생성자
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		camera.showInfo();

		int discountPrice = camera.calcDiscountPrice(0.5);
		System.out.println("Discount Price: " + discountPrice);

//		System.out.println(camera.getName());
//		System.out.println(camera);

		Goods g1 = new Goods();
		Goods g2 = new Goods();
		Goods g3 = new Goods();

		System.out.println("instance count: " + Goods.countOfGoods);
//		System.out.println(g1);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);

		Goods g4 = new Goods("TV", 10000, 10, 0);
		g4.showInfo();
		System.out.println("instance count: " + Goods.countOfGoods);
		
		System.out.println(g4.toString());
	}

}
