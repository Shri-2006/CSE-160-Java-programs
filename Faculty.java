//Shriyans Singh 114807762

public class Faculty extends Employee {

	private String officeHours;
	private int rank;
	private int year=2025;
	public Faculty(String name, String address, String phone_number, String email, int age, double salary, MyDate dateHired, String officeHours, int rank) {
		super(name,address,phone_number,email,age,salary,dateHired);
		this.officeHours=officeHours;
		this.rank=rank;
	}
	public int salaryRange() {
		int years= year-dateHired.getYear();
		int salary=years*rank;
		if(salary<10) {
			int res=1;
			return res;
		}
		else if (salary<20) {
			int res = 2;
			return res;
		}
		else {
			int res=3;
			return res;
		}
		
	}
	public String toString() {
		String res= ("Falculty is "+name);
		return res;
	}
}
