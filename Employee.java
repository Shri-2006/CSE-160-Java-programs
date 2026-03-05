//Shriyans Singh 114807762

public class Employee extends Person {
// An employee has an salary and date-hired of type MyDate.
//Define separately a class named MyDate.java that contains the fields year, month, and day.
	
	protected double salary;
	protected MyDate dateHired;
	public Employee(String name,String address, String phone_number, String email, int age, double salary, MyDate dateHired) {
		super(name,address,phone_number,email,age);
		this.salary=salary;
		this.dateHired=dateHired;
	}
	public String toString() {
		String res= ("Employee is "+name);//why do we need to override? go back and learn more about this
		return res;
	}
	

}
