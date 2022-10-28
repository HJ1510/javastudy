package prob4;

public class SoundTest { // paint 프로그램 비슷 인터페이스 오버라이드&임플리먼트

	public static void main(String[] args) {
		printSound( new Cat() ); // new circle..
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
	
	private static void printSound( Soundable soundable ) {
		System.out.println( soundable.sound() );
	}
}