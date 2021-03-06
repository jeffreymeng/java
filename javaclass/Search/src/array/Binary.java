/*
 * Programmer: Jeffrey Meng
 * Date: Nov 13, 2017
 * Purpose:
 */

package array;

public class Binary {
	public static void main(String[] args) {
		int[] array = {11, 16, 22, 23, 34, 46, 48, 50, 75, 78};
		
		System.out.println(asec(array, 75));
	}
	/**
	 * Searches an ascending integer array for the index of a number.
	 * 
	 * 
	 */
	//DOSENT WORK ON ALL ARRAYS. can't find 75 in {11, 16, 22, 23, 34, 46, 48, 50, 75, 78}
	public static int asec(int[] array, int key) {
		/*
		Binary search:
		find the middle element of the array.
		if the middle element is less than the key, 
		only consider the array above the half.
		if it equals, return the index.
		if the middle element is more
		only consider the array below.
		repeat until element is found or went through the entire array.
		*/
		
		//upper and lower bounds for the current array, both inclusive
		int upper = 0;
		int lower = array.length - 1;
		
		int middle;
		
		while(upper != lower) {
			//find middle of the array
			middle = (upper + lower)/2;//integer division will truncate
			if (array[middle] > key) {//we know the key is in the lower half
				upper = middle - 1;//add one because we know the middle element does not match the key.
			} else if (array[middle] < key){//key is in upper half
				lower = middle + 1;//Subtract one because we know the middle element does not match the key.
			} else if (array[middle] == key) {
				return middle;//we found the element.
			}
			
			
		}
		if (upper == lower && array[lower] == key) {
			return lower;//upper and lower both contain the index of the key
		} else {
			return -1;//element not found.
		}
	}

}
