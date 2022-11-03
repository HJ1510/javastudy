package prob01;

public class PrinterTest { // 오버로딩

	public static void main(String[] args) {
		Printer printer = new Printer();

//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("홍길동");
//		printer.println(new Point(10, 20));

		printer.println("홍길동");
		printer.println(10, true);
		printer.println(10, true, 5.7, new Point(10, 20));

		System.out.println(printer.sum(1));
		System.out.println(printer.sum(1, 2));
		System.out.println(printer.sum(1, 2, 3, 4)); // 가변파라미터
//		System.out.println(printer.sum(new int[] { 1, 2, 3, 4 })); // 배열
		System.out.println(printer.sum(1, 2, 3, 4, 5, 6));
	}
}