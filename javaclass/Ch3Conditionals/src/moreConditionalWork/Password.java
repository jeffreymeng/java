/*
 * Programmer: Jeffrey Meng
 * Date: Sep 26, 2017
 * Purpose: Ask the user for a password and check it
 */

package moreConditionalWork;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		final String PASSWORD = "wronghorsebatterystaple";
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter the password:");
		if (in.nextLine().equals(PASSWORD))
			System.out.println("Hello, You're in!");
		else 
			System.out.println("Sorry, incorrect password.");
		
		in.close();
	}

}
