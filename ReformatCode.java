//Shriyans Singh 114807762
import java.io.*;
import java.util.*;
public class ReformatCode {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			Scanner input= new Scanner(file);
			ArrayList<String> lines = new ArrayList();
			
			while(input.hasNextLine()){	//read
				lines.add(input.nextLine());
			}
			input.close();
			
			PrintWriter fw=new PrintWriter(file);//write
			for(int i =0; i<lines.size(); i++) {
				if(i+1<lines.size()&& lines.get(i+1).trim().equals("{")) {
					fw.println(lines.get(i)+"{");
					i++;
				}
				else {
					fw.println(lines.get(i));
				}
			}
			fw.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File "+args[0]+" not found");
		}

	}
	

}
