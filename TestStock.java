//Shriyans Singh 114807762
public class TestStock {

	public static void main(String[] args) {
	    Stock s1 = new Stock("GOOG", "Google Inc.");
	    Stock s2 = new Stock("FACE", "Facebook Inc.");
	    Stock s3 = new Stock("AMAZ", "Amazon Inc.");
	    s1.setPreviousClosingPrice(1000);
	    s1.setCurrentPrice(2000);
	    System.out.printf("%s's price change percentage is: %.2f %%\n", s1.getSymbol(),s1.changePercent());
	    s2.setPreviousClosingPrice(250);
	    s2.setCurrentPrice(270);
	    System.out.printf("%s's price change percentage is: %.2f %%\n", s2.getSymbol(),s2.changePercent());
	    s3.setPreviousClosingPrice(1500);
	    s3.setCurrentPrice(1600);
	    System.out.printf("%s's price change percentage is: %.2f %%\n", s3.getSymbol(),s3.changePercent());
	  //  System.out.println("Google price change: " + s1.changePercent() + "%");
	   // System.out.println("Facebook price change: " + s2.changePercent() + "%");
	   // System.out.println("Amazon price change: " + s3.changePercent() + "%");
	    
	//    System.out.printf("%s's price change percentage is $.2f%", s1.getSymbol(),s1.changePercent());
	    }

	}


