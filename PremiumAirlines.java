//Shriyans Singh 114807762
import java.util.Scanner;
public class PremiumAirlines {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String membership;
		int price, points;
		
		
		System.out.print("Please enter membership (Diamond/Platinum/Regular): ");
		membership = input.next();
		if(!membership.equals("Diamond")&&!membership.equals("Platinum")&&!membership.equals("Regular")) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		System.out.print("Please enter ticket price: ");
		price = input.nextInt();
		System.out.print("Please enter current points: ");
		points = input.nextInt();
		
		if((membership.equals("Diamond") || membership.equals("Platinum"))&& price >= 5000){
			points+=35;
		}
		else if (membership.equals("Diamond")&&price >= 2000 && points >=300) {
			points+=30;
		}
		
		else if (membership.equals("Platinum")&& price >= 2000) {
			points+=20;
		}
		
		else if (membership.equals("Diamond")&& price >=500 && points >= 100) {
			points +=10;
		}
		
		else if(membership.equals("Regular")&& price >=5000){
			points+=5;
		}
		
		else if (membership.equals("Diamond")&&points >=25) {
			points +=2;
		}
		
		else {
			points +=0;
		}
		System.out.println("Points: "+ points);
		
	}

}
