//Shriyans Singh ID: 114807762

import java.util.Scanner;



public class Discount {
	public static void main(String[] args) {
		
	
		System.out.println("Enter Number of Games: ");
		Scanner game = new Scanner(System.in);
		int g = game.nextInt();
		
		System.out.println("Enter fixed Price: ");
		Scanner price = new Scanner(System.in);
		double op= price.nextDouble();
		
		
		
		if (2<=g && g<=5)
		{
		//discount
			double d = 0.2;
			//new fixed price
			double np = (op *(1-d));
			System.out.println("$" + np+ " with discounted amount per unit: $" + (d*op)+  " from the original price of $"+ op);
			System.out.println( "Final total price: $"+ np + "*" + g + " = " + "$"+(g*np));     
		
		}
		else if( (6<=g && g<=10)){
			double d = 0.3;
			//new fixed price
			double np = (op *(1-d));
			System.out.println("$" + np+ " with discounted amount per unit: $" + (d*op)+  " from the original price of $"+ op);
			System.out.println( "Final total price: $"+ np + "*" + g + " = " + "$"+(g*np));     
		
		}
		else if (11<=g){
			double d = .4;
			//new fixed price
			double np = (op *(1-d));
			System.out.println("$" + np+ " with discounted amount per unit: $" + (d*op)+  " from the original price of $"+ op);
			System.out.println( "Final total price: $"+ np + "*" + g + " = " + "$"+(g*np));     
		
		}
		
		
		
		
		
	game.close();
	price.close();
	}
}

