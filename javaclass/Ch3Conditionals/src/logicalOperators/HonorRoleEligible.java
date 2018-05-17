/*
  * Programmer: Jeffrey Meng
 * Date: Sep 25, 2017
 * Purpose: tell a student if they are elegible for the honor roll.
 */

package logicalOperators;

import java.util.Scanner;

public class HonorRoleEligible {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean qualify;//grade point average, number of courses, and discipline records.
		char diciplineRecords;
		//If all are true they qualify.
		System.out.println("What is your grade point average?");
		qualify = ((int) in.nextDouble()) >= 90;//if your grade is greater than 90, you still qualify
		in.nextLine();
		
		//if they previously qualify, and they have less than 5 courses, they still qualify.
		System.out.println("How many courses are you taking?");
		qualify = qualify && in.nextInt() >= 5;
		
		in.nextLine();
		
		//get the first letter as a lower case char so the if statement is less crowded.
		System.out.println("Have you had any dicipline records(y/n)?");
		diciplineRecords = in.nextLine().toLowerCase().charAt(0);
		
		if (!qualify || diciplineRecords == 'y') {
			System.out.println("Sorry! You are not elegible for the honor roll.");
		} else if (qualify && diciplineRecords == 'n') {
			System.out.println("You qualify for the Honor Roll!");
		} else {
			System.out.println("You did not enter y or n for wether you had dicipline records.");
		}
		in.close();
	}

}
