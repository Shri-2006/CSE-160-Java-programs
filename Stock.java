//Shriyans Singh 114807762
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
       this.symbol=symbol;
        
        this.name=name;
    }


    public String getSymbol() { 
    	return symbol; 
    	}
    public String getName() {
    	return name; 
    	}
    public double getPreviousClosingPrice() { 
    	return previousClosingPrice; 
    	}
    public double getCurrentPrice() {
    	return currentPrice;
    	}

    public void setPreviousClosingPrice(double previousClosingPrice) {
    	this.previousClosingPrice = previousClosingPrice;
    	}
    public void setCurrentPrice(double currentPrice) {
    	this.currentPrice = currentPrice; 
    	}
    public void setSymbol(String symbol) {
    	this.symbol=symbol;
    }
    public void setName(String name) {
    	this.name=name;
    }


    public double changePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
