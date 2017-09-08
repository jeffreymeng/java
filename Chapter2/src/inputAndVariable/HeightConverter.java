/*
 * Programmer:Jeffrey Meng
 * Date: 8/30/17
 * Purpose: Ask for the users height in inches, then convert to feet and inches.
 */
package inputAndVariable;

import java.util.Scanner;

public class HeightConverter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches:");
		int height = in.nextInt();
		
		int feet = height / 12;
		int inches = height % 12;
		System.out.println(feet + " feet and " + inches + " inches.");
		
		in.close();
	}
}
