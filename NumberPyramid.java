package Lab24;
//Shriyans Singh 114807762
public class NumberPyramid {
	 public static void main(String[] args) {
	  display(5);
	  displayRec(5);
	 }
	 
	 public static void display(int n){
	  for(int i=1;i<=n;i++){
	   for(int j=n-i;j>0;j--){
	    System.out.print("  ");
	   }
	   for(int j=i;j>0;j--){
	    System.out.print(j+" ");
	   }
	   for(int j=2;j<i+1;j++){
	    System.out.print(j+" ");
	   }
	   System.out.println();
	  }
	 } 
	 
	 public static void displayRec(int n) {
	  recDisplay(1, n);
	 }
	 public static void recDisplay(int i, int n) {
	  if (i <= n) {
	   recDisplay2(n - i);
	   recDisplay3(i);
	   recDisplay4(2,i);
	   System.out.println();
	   recDisplay(i + 1, n);
	  } // else do nothing
	 }
	 public static void recDisplay2(int j) {
	  if (j > 0) {
	   System.out.print("  ");
	   recDisplay2(j - 1);
	  } // else do nothing
	 }
	 
	 public static void recDisplay3(int j) {
	  if (j > 0) {
	   System.out.print(j + " ");
	   recDisplay3(j - 1);
	  } // else do nothing
	 }
	 
	 public static void recDisplay4(int j, int i) {
	  if (j < i+1) {
	   System.out.print(j + " ");
	   recDisplay4(j + 1, i);
	  } // else do nothing
	 }
	}