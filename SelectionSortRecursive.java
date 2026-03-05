package Lab24;
//Shriyans Singh 114807762
public class SelectionSortRecursive {
	
	public static void sort(int[] arr) {
		 sort(arr, 0 );
		 }
	public static void sort(int[] arr, int i) {
		if(i<arr.length-1) {
			int temp=arr[i];
			int k = min(arr,i,i);
			arr[i]=arr[k];
			arr[k]=temp;
			sort(arr,i+1);
		}
	}
	
		// TODO Auto-generated method stub
		public static int min(int[] arr, int i, int minIdx) {
			if(i< arr.length) {
				return(arr[i]<arr[minIdx]) ? min(arr,i+1,i) : min(arr, i +1, minIdx); 
			}
			else {
				return minIdx;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,3,1,5,7,0};
		sort(arr);
		for(int e:arr) {
			System.out.print(e+" ");
		}
		

	}

}
