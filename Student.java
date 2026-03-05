//Shriyans Singh 114807762

public class Student extends Person {
	//A student has a class status (freshman, sophomore, junior, or senior - define these various statuses as constants).
	
	public static final String FRESHMAN="freshman";
	public static final String SOPHMORE="sophmore";
	public static final String JUNIOR="junior";
	public static final String SENIOR="senior";
	private String status;
	
	public Student(String name, String address, String phone_number, String email, int age, String status) {
		super(name,address,phone_number,email,age);
		this.status=status;
	}
	
	
/*	public String getFreshman(){
		return freshman;
	}
	public String getSophmore() {
		return sophmore;
	}
	public String getJunior() {
		return junior;
	}
	public String getSenior() {
		return senior;
	}
	
	*/
	public String toString() {
    	String res = ("Student is: "+name);
        return res;
 
    }
}
	


