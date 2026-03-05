//Shriyans Singh 114807762
//import java.util.Scanner; Wasn;t actually needed :(
import java.lang.Math;
import java.lang.reflect.Array;
public class ArrayUtils {
	//public static int[] randomArray(int size, int upper_limit) {
		/*double[] temp = new double[size];
		int[] res = new int[size];
		//System.out.print("[");
		for (int i = 0; i<size;i++) {
			temp[i]=(Math.random()*upper_limit);
			res[i]=(int)(temp[i]);
			
		}
		/*for(int j=0; j<size-1; j++) {
			System.out.print(res[j]+ ", ");
		}
		
		System.out.print(res[size-1]+"]");
		return res;
		
	}*/
		
	public static int[] randomArray(int size, int upper_limit) {
		//I am simplifying the code that worked previously
		int[] res = new int[size];
		for(int i=0;i<size;i++) {
			res[i]=(int)(Math.random()*upper_limit);
		}
		return res;
	}
	public static void print (int[] res) {
		System.out.print("[");
		for(int j=0; j<res.length-1; j++) {
			System.out.print(res[j]+ ", ");
		}
		System.out.print(res[res.length-1]);
		System.out.print("]");
	}
	
	public static int arraySum(int[] res) {//I originally put this as double because I read the problem wrong...oops
		int sum=0;
		for (int i=0; i<res.length;i++) {
			sum+=res[i];
		}
		//System.out.println(sum);
		return sum;
	}
	
	public static int contains(int[] rando, int x) {
		for(int i=0;i<rando.length;i++) {
			if(rando[i]==x) {
				return i;
			}// else: return 1;
		}
		return -1;
	}
	
	public static int countMultiplesof(int[] rando, int multiple_of) {
		int res=0;
		for(int i=0;i<rando.length;i++){
			if(isMultiple(rando[i], multiple_of)) {
				res++;
			}
		}
		return res;
	}
	public static boolean isMultiple(int rando, int multiple_of) {
		if(rando%multiple_of==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		//a
		int[] rando= randomArray(100,21);
		
		
		//b
	//	print(new int[]{1,2,3,4});
		//System.out.println();
		print(randomArray(100,21));
		System.out.println();
		
		//c
		arraySum(new int[]{1, 2});
		double average =  ((double) arraySum(rando)/rando.length);//originally, (double) was not inside the parentheses. I noticed the average wasn't being done properly luckily:D
		System.out.println("Sum: "+arraySum(rando));
		System.out.println("Average: "+average);
		
		//d
		//int single=5;
		int x=12;
	//	System.out.println(contains(new int[]{1,2,3,4}, 2)); works
	//	System.out.println((contains(new int[]{1,2,3,4}, 5) ); looks good
		int index_of_array=contains(rando,x);
		System.out.println("Index of "+ x +" in the array: "+index_of_array);
		
		
		
		//e
		
		
		int multi_count=countMultiplesof(rando, 7);
		
		//System.out.println(countMultiplesof((new int[]{1,2,3,4}), 2)); //returns 2 good (because 2 and 4 are multiples of 2));
		System.out.println("# of multiples of 7: "+ multi_count);
		
		
		
		
		}
	}















/*not working, just going to try a different method. Ok, I wrote the print function out, and now I saw part b, so I am just reusing it.
  public static int[]	
  randomArray(int size, int upper_limit) {
 

int [] temp = new int[size];
for(int i = 0; i<size;i++) {
	temp[i]=(int) (Math.random()*upper_limit);
}
return temp;

}*/