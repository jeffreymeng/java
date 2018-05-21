/*
 * Programmer: Jeffrey Meng
 * Date: Oct 13, 2017
 * Purpose: Print ladder
 */

package nestedLoops;

public class AlphabetLadder {

	public static void main(String[] args) {
		 
		 for (int a = 0; a < 6; a ++) {
			 for (int b = 0; b <= a; b ++) {
				 System.out.print((char) (b + 65));
			 }
			 System.out.println();
			 
		 }
	}

}