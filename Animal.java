//Shriyans Singh 114807762
public class Animal {
	private String name;
	private double year;
	private double yearsAtShelter;
	
	public Animal (String name, double year, double yearsAtShelter) {
		this.name=name;
		this.year=year;
		this.yearsAtShelter=yearsAtShelter;
	}
	public double getYear() {
		return year;
	}
	public String getName() {
	return name;
	}
	public double getYearsAtShelter() {
		return yearsAtShelter;
	}
	
	public void setYear(double year) {
		this.year=year;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setYearsAtShelter(double yearsAtShelter) {
		this.yearsAtShelter=yearsAtShelter;
	}
	public String toString() {
		return "Name: "+name+ " year "+year+" YearsAtShelter: "+yearsAtShelter;
	}
}
