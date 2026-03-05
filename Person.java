//Shriyans Singh 114807762

public class Person {
	//A person has a name, address, phone number, age and email address and implement a method getAge():int.
	
	protected String name;
	protected String address;
	protected String phone_number;
	protected int age;
	protected String email;
	
	
	
	public Person(String name, String address, String phone_number, String email, int age) {
		this.name=name;
		this.address=address;
		this.phone_number=phone_number;
		this.age=age;
		this.email=email;
	}
		
	
	
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	/*public String getAddress() {
		return address;
	}*/
	public String getPhoneNumber() {
		return phone_number;
	}
	public String getEmail() {
		return email;
	}
/*	
	public void setName(String name) {//set requires a void, get requires () after
        this.name = name;
    }
	public void setAddress(String address){//set requires a void, get requires () after
        this.address = address;
    }
	public void setPhoneNumber(String phone_number) {//set requires a void, get requires () after
        this.phone_number = phone_number;
    }
	public void setEmail(String email) {//set requires a void, get requires () after
        this.email = email;
    }
	public void setAge(int age) {//set requires a void, get requires () after
        this.age = age;
    }*/
	
	
	public String toString() {
        	String res = ("Person: "+name);
            return res;
     
        }
    }
	


