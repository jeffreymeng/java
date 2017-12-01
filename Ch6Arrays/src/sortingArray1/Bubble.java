/*
 * Programmer: Jeffrey Meng
 * Date: Nov 30, 2017
 * Purpose:
 */

package sortingArray1;

import sort.BubbleSort;

public class Bubble {
	public static void main(String[] args) {
		int[] array ={ 65, 45, 34, 12, 99, 54, 39, 2, 88, 18};
		printArray(array);
		printArray(BubbleSort.dsec(array));
	}
	public static void printArray(int... arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);

			} else {
				System.out.print(arr[i] + ", ");
			}
			
		}
		System.out.println("}");
	}
	
	
}
