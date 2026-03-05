//Shriyans Singh 114807762

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Riley = new Person("Riley", "123 Main St", "555-5555", "riley@email.com", 30);
        System.out.println(Riley);
        Student Bob = new Student("Bob", "456 Oak Ave", "555-5555", "bob@email.com", 20, Student.SOPHMORE);
        System.out.println(Bob);
        Employee Adrian = new Employee("Adrian", "789 Pine Rd", "555-5555", "Adrian@email.com", 40, 50000, new MyDate(2015, 6, 15));
        System.out.println(Adrian);
        Faculty Fodor = new Faculty("Fodor", "321 Elm St", "555-5555", "Fodor@email.com", 50, 80000, new MyDate(2010, 3, 10), "MW 11am-12:30pm", 3);
        System.out.println(Fodor);
        Staff Emily = new Staff("Emily", "654 Maple Ln", "555-5555", "Emily@email.com", 35, 60000, new MyDate(2018, 11, 1), "HR Manager");
        System.out.println(Emily);
	
        
//IT WORKS AYYYYY
	}

}
