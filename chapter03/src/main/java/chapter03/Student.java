package chapter03;

public class Student extends Person {
	private String major;
	private int grade;
	
	public Student() {
		System.out.println("Student() called");
		// this 본인클래스에서 가져올때
		// super 부모클래스에서 가져올때
		// 자식클래스의 모든 생성자에서 부모클래스의 특정 생성자를 명시(explicity)하지 않을 경우
		// 부모의 기본 생성자 super(); 가 자식 생성자 코드 앞에 호출된다 
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
