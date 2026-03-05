//Shriyans Singh 114807762
public class vehicletest {

	public static void main(String[] args) {
		Bicycle biketest=new Bicycle(" Bobbike",2);
		MotorizedVehicle cartest=new MotorizedVehicle("Bobcar", 4, 6);
		System.out.print(biketest);
		System.out.print(" and \nthis checks if equal: " );
		System.out.print(biketest.equals(new Bicycle(" Bobbike",2)));
		
		System.out.println("\n");
		System.out.print(cartest);
		System.out.print("and \nthis checks if equal: ");
		System.out.print(cartest.equals(new MotorizedVehicle("Bobcar", 4, 6)));
	}

}
