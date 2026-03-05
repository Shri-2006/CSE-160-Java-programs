//Shriyans Singh 114807762
public class Vehicle {
	private String owner;
	private int wheels;
	public Vehicle(String owner, int wheels) {
		this.owner=owner;
		this.wheels=wheels;
	}
	public String getOwner() {
		return owner;
	}
	public int getWheels() {
		return wheels;
	}
	public String toString() {
		String res=("The vehicle is owned by "+owner+"and it has "+wheels+"wheels");
		return res;
	}
	public boolean equals(Object o) {
		if(o instanceof Vehicle) {
			Vehicle veh=((Vehicle) o);
			return owner.equals(veh.owner) && wheels == veh.wheels;
		}
		return false;
		
	}
}
