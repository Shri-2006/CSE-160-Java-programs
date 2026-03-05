//Shriyans Singh 114807762
public class MotorizedVehicle extends Vehicle {


		
		private double engineVolume;
		public MotorizedVehicle(String owner, int wheels,double engineVolume) {
			super(owner,wheels);
			this.engineVolume=engineVolume;
		}
		public double getEngineVolume() {
			return engineVolume;
		}
		public double hp() {
			double res=(engineVolume*getWheels());
			return res;
	}
		public String toString() {
			String res = ("The motorized vehicle is owned by "+getOwner()+" and has "+getWheels()+" wheels and has a "+engineVolume+" Liter engine.");
			return res;
		}
		public boolean equals(Object o) {
			if(o instanceof MotorizedVehicle) {
				MotorizedVehicle motor=(MotorizedVehicle) o;
				boolean res=(super.equals(motor)&&engineVolume==motor.engineVolume);
				return res;
			}
			return false;
		}
		

}

