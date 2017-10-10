/*
 * Programmer: Jeffrey Meng
 * Date: Oct 6, 2017
 * Purpose: Print all the odd integers between 5 and 51, inclusive.
 */

package whileLoops;

public class PrintOddInts {

	public static void main(String[] args) {
		int num = 5;
		while(num <= 51) {
			if (num % 2 == 1) {
				System.out.println(num);
			}
			num ++;
		}

	}

}
