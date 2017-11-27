/*
 * Programmer: Jeffrey Meng
 * Date: Nov 17, 2017
 * Purpose:
 */

package sequentialSort;

public class SequentialSort {

	public static void main(String[] args) {
		String[] fruit = { "bananna", "orange", "blueberry", "orange", "blackberry", "dragonfruit", "apple", "apricot", "mango", "coconut"};
		countKeys(fruit, "orange");
		
		
	}
	public static int countKeys(String[] array, String key) {
		int count = 0;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] == key) {
				count ++;
			}
		}
		
		return count;
	}

}
