/*
 * Programmer: Jeffrey Meng
 * Date: 9/5/17
 * Purpose: Ask a user to enter their last name, then concatenate @google.com 
 * 	to the name and print the result.
 */

package stringExercises;

import java.util.Scanner;

public class ConcatenateAtGoogleDotCom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String lastName;
		
		System.out.println("Please enter your last name:");
		lastName = in.nextLine();
		
		System.out.println(lastName + "@google.com");
		
		in.close();
	}

}
