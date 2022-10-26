package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		double[] result = null;

		if (a == null) {
			return result;
		}

		result = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}

		return result;
	}

	public static int[] dobleToInt(double[] d) {
		int[] result = null;

		if (d == null) {
			return result;
		}

		result = new int[d.length];
		for (int i = 0; i < d.length; i++) {
			result[i] = (int) d[i];
		}
		return result;
	}

	public static int[] concat(int[] a, int[] b) {
//		int[] result = null;               // 내가 만든것
//		
//		result = new int[a.length + b.length];
//		for (int i = 0; i < a.length; i++) {
//			result[i] = a[i];
//			for (int j = 0; j < b.length; j++) {
//				result[j + a.length] = b[j];
//			}
//		}
//		return result;

		int size = 0;
		if (a != null) {
			size += a.length;
		}
		if (b != null) {
			size += b.length;
		}
		int[] result = new int[size];
//		int[] result = new int[(a == null ? 0 : a.length) + (b == null ? 0 : b.length)]; // 위 내용을 한줄로 만든것

		int index = 0;
		for (int v : a) {  // for each 구문
			result[index++] = v;
		}

		for (int v : b) {
			result[index++] = v;
		}

		return result;
	}

}
