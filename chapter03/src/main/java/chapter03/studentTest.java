package chapter03;

public class studentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setGrade(1);
		
		Person p1=s1; // 업캐스팅(upcasting) 암시적(implicity)
		p1.setName("둘리");
		
		// 전공 입력을 위해서 다운캐스팅
		// Student s2 = p1; // 오류!
		Student s2= (Student)p1; // 다운캐스팅(downcasting) 명시적(explicity)
		s2.setMajor("Computer science");
		}

}
