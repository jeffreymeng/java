/*
 * Programmer: Jeffrey Meng 
 * Date: August 29, 2017
 * Purpose: Accept the current year as input from the user, then print out the year in scores.
 */

package inputAndVariable;

import java.util.Scanner;

public class ConvertToScore {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = 0;
		int score = 0;
		int convertedYears = 0;
		
		
		System.out.println("Please enter the current year:");
		year = in.nextInt();
		score = year / 20;
		convertedYears = year % 20;
		
		System.out.println(score + " Score and " + convertedYears + " years.");
		
		in.close();
	}
}
