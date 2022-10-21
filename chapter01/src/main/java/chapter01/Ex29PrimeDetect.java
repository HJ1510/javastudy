package chapter01;

public class Ex29PrimeDetect {

	public static void main(String[] args) {
		// 2 ~ 1000 까지에서 소수를 화면에 출력 하세요.
	
		for(int i = 2; i <= 1000; i++) {
			
			boolean isPrime = true;
			
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}		
}
