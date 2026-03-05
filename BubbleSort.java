//Shriyans Singh 114807762
public class BubbleSort {
	public static double[] bubbleSort(double[] list) {
		boolean changed = true;
		do {
			changed = false;
			for (int j = 0; j < list.length - 1; j++)
				if (list[j] > list[j + 1]) {
					double temp = list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					changed = true;
			}
		} while (changed);
		return list;
	}

	public static void main(String[] args) {
		double [] list = new double[] { 6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
		double[] sorted_list = bubbleSort(list);
		for(double num: sorted_list) {
			System.out.print(num+" ");
		}

	}

}
