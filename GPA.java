//Shriyans Singh 114807762
public class GPA {
	public static double gpaCalculator(String[] grades) {
		if(grades.length ==0) {
			return -1;
		}
		double total=0;
		
		for(String grade: grades) {
			switch(grade) {
				case "A":
					total +=4;
					break;
				case "A-":
					total+=3.67;
					break;
				case "B+":
					total +=3.33;
					break;
				case "B":
					total+=3.00;
					break;
				case "B-":
					total+=2.67;
					break;
				case "C+":
					total+=2.33;
					break;
				case "C": 
					total+=2.0;
					break;
				case "C-":
					total+=1.67;
					break;
					
				case "D+":
					total+=1.33;
					break;
				case "D":
					total+=1.0;
					break;
				case "F":
					total+=0.0;
					break;
				default:
					return -1;
			}
		}
		double average= total/grades.length;
		return average;
	}
	
	 
	public static void main(String [] args) {
		System.out.println(gpaCalculator(new String[] {"A", "F", "C", "B"}));
		System.out.println(gpaCalculator(new String[] {"A-", "B-", "C-", "F"}));
		System.out.println(gpaCalculator(new String[] {"F", "C+", "D+", "A+"}));
		
	}
}
