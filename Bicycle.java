//Shriyans Singh 114807762

public class Bicycle extends Vehicle{
	public Bicycle(String owner, int wheels) {
		super(owner, wheels); //I KEEP TYPING l INSTEAD OF ; ITS SO ANNOYINGGGGG
	}
	public String toString() {
		String res=("The bicycle is owned by "+getOwner()+" and has "+getWheels()+" wheels.");
		return res;
	}

}
