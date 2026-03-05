//Shriyans Singh 114807762

public class Rectangle {
	private double width,height;
	private String color;
	
	public Rectangle() {//no arg
		this.width=1;
		this.height=1;
		this.color="blue";
		
	}
	
	public Rectangle(double width, double height)//width&height only,defualt color
	{
        this.width=width;
        this.height=height;
        this.color="blue";
        
    }
	public Rectangle(double width, double height, String color) //width,height, and color
	{
	        this.width = width;
	        this.height = height;
	        this.color = color;
	}
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width) {
			this.width=width;//return isn't working here 
		
		
	}
	public double getHeight() {
		return this.height;
	}
	
	public double getArea() {
		return (width*height);
	}
	public double getPerimeter() {
		return(2*(width+height)); 
	}
	
	 public String getColor() {
		 return color; 
	}
	public void setColor(String color) { 
	    	this.color=color;
	}
	
	   
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
