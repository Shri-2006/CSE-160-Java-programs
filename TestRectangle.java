//Shriyans Singh 114807762
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectnagle1= new Rectangle(4,40,"red");
		Rectangle rectangle2=new Rectangle(3.5,35.9,"red");
		
		System.out.println("Rectangle 1: Width = " + rectnagle1.getWidth() + " Height = " + rectnagle1.getHeight() + " color = " + rectnagle1.getColor()+"Area: " + rectnagle1.getArea() + " perimeter: " + rectnagle1.getPerimeter());
		System.out.println("Rectangle 2: Width = " + rectangle2.getWidth() + " height = " + rectangle2.getHeight() + " color = " + rectangle2.getColor()+"Area: " + rectangle2.getArea() + " Perimeter: " + rectangle2.getPerimeter());
	}

}
