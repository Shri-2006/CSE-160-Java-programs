package Lab24;
//Shriyans Singh 114807762

public class BinarySearchRecursive {
	/* public static int recursiveBinarySearch(int[] list, int key,
			 int low, int high) {
			 if (low <= high) {
			 int mid = (low + high) / 2;
			 if (key < list[mid])
			 return recursiveBinarySearch(list, key, low, mid - 1);
			 else if (key == list[mid])
			 return mid; // Base case
			 else
			 return recursiveBinarySearch(list, key, mid + 1, high);
			 } else // The list has been exhausted without a match
			 return -low - 1; // Base case		 
	 }*/
	 
	 public static int binarySearch(int[] list, int key) {
		 return binarySearch(list,key,0,list.length-1);
	 }
	 public static int binarySearch(int[] list, int key, int low, int high) {
		 if(low>high) {
			 return -low-1;
		 }
		 int mid=(low+high)/2;
		 if(key<list[mid]) {
			 return binarySearch(list,key,low,mid-1);
		 }
		 else if(key==list[mid]) {
			 return mid;
		 }
		 else {
			 return binarySearch(list,key,mid+1,high);
		 }
	 }
	 
	 public static void main(String[] args) {
		 int[] list = {3,8,15,22,77};
		 
		 System.out.println(binarySearch(list,77));
	 }
}
