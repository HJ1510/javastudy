package prob02;

import java.util.Arrays;
import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		String[] infos=null;
		for(int i=0; i<COUNT_GOODS; i++) {
		String line = scanner.nextLine();
		infos=line.split(" ");		
		
//		System.out.println(Arrays.toString(infos));			
		String name=infos[0];
		int price=Integer.parseInt(infos[1]);
		int countStock=Integer.parseInt(infos[2]);
		}
				
		// 상품 출력
		System.out.println(infos[0]+"(가격:"+infos[1]+"원)이 "+infos[2]+"개 입고 되었습니다.");
		goods[0].showInfo();
	
		
		// 자원정리
		scanner.close();
		
	}
}
