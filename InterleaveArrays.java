//Shriyans Singh 114807762
public class InterleaveArrays {
	public static int[] intreleaveArrays(int [] first, int[] second) {
		int size= first.length+second.length;
		int[] res = new int[size];
		int min=0;
		if(first.length<second.length) {
			min=first.length;
			
		}
		else {
			min=second.length;
		}
		/*else if(first.length==second.length) {
			min=size/2;
		}*/
		int j=0;
		
		for(int i=0; i<min;i++) {
			res[j++]=first[i];
			res[j++]=second[i];
		}
		for(int i=min;i<first.length;i++) {
			res[j++]=first[i];
			
		}
		for(int i=min;i<second.length;i++) {
			res[j++]=second[i];
		}
		return res;
		
	}
	public static void print (int[] res) {//I took this code from ArrayUtils.java, because the arrays were not printing proprely and I remembered that I made this code already:D
		System.out.print("[");
		for(int j=0; j<res.length-1; j++) {
			System.out.print(res[j]+ ", ");
		}
		System.out.print(res[res.length-1]);
		System.out.print("]");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] res_1=intreleaveArrays(new int[]{1,3,5}, new int[]{2,4,6});//returns [1, 2, 3, 4, 5, 6]
		int[] res_2=intreleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8}); //returns [10, 2, 20, 4, 30, 6, 40, 8, 50, 60, 70, 80]
		int[] res_3=intreleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10});// returns [1, 2, 3, 4, 5, 6, 8, 10]
		
		print(res_1);
		print(res_2);
		print(res_3);//all three work! This was my third time debugging!(Thats a very low number for me:D)
		
		int[] res_4=intreleaveArrays(new int[] {3,4,57,7,8,9,233,21}, new int[] {1,3,4,6,122,321,542,312});
		int[] res_5=intreleaveArrays(new int[] {3,341,2132,3441,54,12,12,32,2,1,2,3,4,5,6,8,2,3}, new int[] {2,1,34,5,2,4,3,1,24,5,7,3,22,5,7,31,2});
		print(res_4);
		print(res_5);//works!!!
		//making one more just in case
		int [] res_6=intreleaveArrays(new int[] {2,3,1,34}, new int[] {2,2,3,4543});
		print(res_6);
		
		/*System.out.println(intreleaveArrays(new int[]{1,3,5}, new int[]{2,4,6}));// returns [1, 2, 3, 4, 5, 6]
		System.out.println(intreleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8})) ;//returns [10, 2, 20, 4, 30, 6, 40, 8, 50, 60, 70, 80]
		System.out.println(intreleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10})) ;//returns [1, 2, 3, 4, 5, 6, 8, 10]
	*/}

}
