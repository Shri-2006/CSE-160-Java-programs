package Lab20;
//Shriyans Singh 114807762
public class FixedCapacityPump extends Pump {

	   private double capacity;

	   public FixedCapacityPump(double capacity) {

	       super();

	       this.capacity = capacity;

	   }
	  // @override
	   public void sellGallons(double sold) {
		   if(sold>this.capacity) {
			   super.sellGallons(this.capacity);
		   }
		   else {
			   super.sellGallons(sold);
		   }
	   }

	  

	}