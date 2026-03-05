package HW6;//Finally figured out how to organize my hw properly using packages...
//Shriyans Singh 114807762
public class Ingredient {
	private String name;
	private String measuringUnit;
	private int caloriesPerUnit;
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		this.name=name;
		this.measuringUnit=measuringUnit;
		this.caloriesPerUnit=caloriesPerUnit;
	}
	//putting the get stuff because it will prob be needed based on past labs
	public String getName() {
		return name;
		
	}
	public String getMeasuringUnit(){
		return measuringUnit;
	}
	public int getCaloriesPerUnit() {
		return caloriesPerUnit;
	}
	
	public String toString() {
		return  "Ingredient\n"+ "name=" + name + "\n" + "measuringUnit=" + measuringUnit + "\n" + "caloriesPerUnit=" + caloriesPerUnit;
	}
	
/*	public String toString() {
 * changing this toString because the directions say to write it in a certain way.
		return "name is "+ name+" measuring units are: "+ measuringUnit+ "calroies per each unit is: "+ caloriesPerUnit;
	}
	*/
	public boolean equals(Object o) {
		if (o instanceof Ingredient) {
			return (caloriesPerUnit==((Ingredient)o).caloriesPerUnit)&&(name.equals(((Ingredient)o).name))&&(measuringUnit.equals(((Ingredient)o).measuringUnit));
		}
		return false;
		
	}
	
	

}
