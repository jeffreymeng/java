/*
 * Programmer: Jeffrey Meng
 * Date: Nov 30, 2017
 * Purpose:
 */

package sortingArray1;

import sort.ExchangeSort;

public class Exchange {
	public static void main(String[] args) {
		double[] array ={ 43.2, 13.6, 91.4, 23.6, 72.1};
		printArray(array);
		printArray(ExchangeSort.asec(array));
	}
	public static void printArray(double... arr) {
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
