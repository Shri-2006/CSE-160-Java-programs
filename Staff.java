//Shriyans Singh 114807762

public class Staff extends Employee{

	private String title;
	public Staff(String name,String address,String phone_number,String email,int age,double salary,MyDate dateHired,String title) {
        super(name, address, phone_number, email, age, salary, dateHired);//relearn what super does
        this.title = title;
    }
	public String toString() {
		String res= ("Staff is "+ name);
		return res;
	}

}
