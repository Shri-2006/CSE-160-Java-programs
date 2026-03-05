package Lab20;
//Shriyans Singh 114807762
public class Station {

    private double myBasePrice; // current price per gallon of gas for self-service pumps

    private Pump[] myPumps; // the list of gas pumps at the station

    public Station(double myBasePrice, Pump[] myPumps) {

        this.myBasePrice = myBasePrice;

        this.myPumps = myPumps;

    }

    

    // postcondition: returns the total cash value of sales for all pumps

    public double totalSales() {
    	double total=0;
    	for(int i =0; i<myPumps.length;i++) {
    		if (i==0||i==1) {
    			total+=myPumps[i].gallonsSold()*(myBasePrice+0.25);
    		}
    		else {
    			total+=myPumps[i].gallonsSold()*(myBasePrice+0);
    		}
    	}

        // to be implemented in Part B
    	return total;
        //return -1;

    }

    // postcondition: for every Pump p in this station

    // p.GallonsSold() is 0.0

    public void resetAll() {

      for(Pump p: myPumps) {
    	  p.resetGallonsSold();
      }

    }




    // postcondition: returns the total cash value for every pump in this      

    // station

    // resets every Pump in this station

    public double closeStation() {

        // to be implemented in Part C
    	double total=totalSales();
    	resetAll();
    	return total;
      //  return -1;

    }

    public static void main(String[] args) {

        Pump[] myPumps = new Pump[4];

        myPumps[0] = new Pump();

        myPumps[1] = new Pump();

        myPumps[2] = new Pump();

        myPumps[3] = new FixedCapacityPump(5.0);

        myPumps[0].sellGallons(5.3);

        myPumps[1].sellGallons(2.5);

        myPumps[2].sellGallons(6.0);

        myPumps[3].sellGallons(3.4);

        Station station = new Station(2.00, myPumps);

        System.out.println(station.totalSales());

        station.resetAll();

        System.out.println(station.totalSales());

        myPumps[0].sellGallons(2.5);

        myPumps[1].sellGallons(5.67);

        myPumps[2].sellGallons(3.25);

        myPumps[3].sellGallons(6.8);

        System.out.println(station.closeStation());

    }

}