//Shriyans Singh 114807762
import java.util.Scanner;
public class Conversions {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String selection = "";
		double entered_number,final_value;
		
		do{
			System.out.println("A - convert pounds to kilos\r\n"
					+ "B - convert kilos to pounds\r\n"
					+ "C - convert kilometers to miles\r\n"
					+ "D - convert miles to kilometers\r\n"
					+ "E - convert Celsius to Fahrenheit\r\n"
					+ "F - convert Fahrenheit to Celsius\r\n"
					+ "G - Exit\r\n");
			System.out.print("Enter you choice: ");
			selection=input.next();
			
			if (selection.toUpperCase().equals("A"))
			{
				System.out.print("Enter pounds: ");
				entered_number = input.nextDouble();
				final_value= entered_number/2.20462;
				System.out.printf("%f pounds is %.4f kilos \n", entered_number, final_value);
				//break;
			}
			
			if(selection.toUpperCase().equals("B")) {
				System.out.print("Enter kilos" );
				entered_number = input.nextDouble();
				final_value=entered_number*2.20462;
				System.out.println(entered_number+" kilos is "+final_value+" pounds");
				//break;
			}
			if(selection.toUpperCase().equals("C")) {
				System.out.print("Enter kilometers" );
				entered_number = input.nextDouble();
				final_value= entered_number/1.609;
				System.out.println(entered_number+"kilometers is "+final_value+" miles");
				//break;
				
			}
			
			if(selection.toUpperCase().equals("D")) {
				System.out.print("Enter miles" );
				entered_number = input.nextDouble();
				final_value = entered_number*1.609;
				System.out.println(entered_number+ " miles is "+ final_value+ " kilometers");	
				//break;
			}
			if(selection.toUpperCase().equals("E")) {
				System.out.print("Enter Celsius" );
				entered_number = input.nextDouble();
				final_value= (entered_number * (9/5))+32;
				System.out.println(entered_number+ " celsius is : "+ final_value+" farenheit");		
				//break;
			}
			
			if(selection.toUpperCase().equals("F")) {
				System.out.print("Enter Farenheit" );
				entered_number = input.nextDouble();
				final_value = (entered_number -32)*(5/9);
				System.out.println(entered_number+ " farenheit is : "+ final_value+" celsius");	
				//break;
				
			}
			
			
			
			
			//System.out.println("value of selection " + selection);
			
			
		}while(!selection.toUpperCase().equals("G"));
		System.out.println("Goodbye");
		input.close();
	}

}
