package prob04;

public class Depart extends Employee {
	private String department;
	
	public Depart(String name, int salary, String depart) {
		super.setName(name);
		super.setSalary(salary);
		this.department=depart;
	}

	@Override
	public void getInformation() {
		System.out.println( "이름: " + super.getName() + "\t연봉: " + super.getSalary()+"\t부서:"+department);
	}
	
	
}
