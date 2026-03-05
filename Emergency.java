//Shriyans Singh 114807762

public class Emergency{
	
	public static void main(String[] args) {
		System.out.println(emergency("Hello, my name is John Smith. I need to report a fire. Please come to 100 Circle Road.")); // expecting "a fire at 100 Circle Road reported by John Smith"
        
		System.out.println(emergency("Hello, my name is Mary Smith. I need to report a car accident. Please come to 2635 Main Street.")); // expecting "a car accident at 2635 Main Street reported by Mary Smith"
		        
		System.out.println(emergency("Hello, my name is Joe M Bell. I need to report a robbery. Please come to 3595 Oakwood Avenue.")); // expecting "a robbery at 3595 Oakwood Avenue reported by Joe M Bell"
}
	public static String emergency(String call) {
		int end_of_name = call.indexOf(".");
		String name = call.substring(18, end_of_name);
		
		
		int index_of_report = call.indexOf(" report "), index_of_Please= call.indexOf(". Please");
		String problem = call.substring(index_of_report + 7, index_of_Please);
		
		int location_index = call.indexOf("Please come to ");
		String location = call.substring(location_index + 15, call.length() - 1);
		
		return( problem + " at " + location +" reported by "+name);
	}
}






























































































/*public class Emergency {
		public static String emergency(String call) {
			String name= "", event="",where="",res="",temp="";
			
			
			for(int i =0; i<call.length(); i++) {
				temp +=call.charAt(i);
				
				if(temp.equals("Hello, my name is ")) {
					for (int j =18; j < call.length(); j++) {
						if(call.charAt(i)== '.') {
							break;
						}
						name+= call.charAt(i);
					}
					temp="";
				}
				if(temp.equals(name)) {
					temp="";
				}
				if(temp.equals(". I need to report ")) {
					for (int j =name.length()+37; j < call.length(); j++) {
						if(call.charAt(j)== '.') {
							break;
							}
						event += call.charAt(i);
					}
					temp = "";
				}
				if(temp.equals(" "+ event))
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/