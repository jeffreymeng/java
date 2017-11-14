/*
 * Programmer: Jeffrey Meng
 * Date: Nov 13, 2017
 * Purpose:
 */

package casino;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SlotMachine {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		/* RIGGED VERSION:
		System.out.println("Type any charcter to spin:");
		
		in.nextLine();
		System.out.println("You Lose!");
		in.close();
		*/
		System.out.println(randInt(1,2));
		
		
	}
	// random number, min and max inclusive 
	public static int randInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	public static char randChar() {
		/*
		 * UPPER
		 * 65-90
		 * LOWER
			97-122
		 */
		//if ()
		return 'a';
	}

}
