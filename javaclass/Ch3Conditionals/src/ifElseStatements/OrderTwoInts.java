/*
 * Programmer: Jeffrey Meng
 * Date: Sep 21, 2017
 * Purpose: Ask the user to enter two numbers. Print out in ascending order.
 */

package ifElseStatements;

import java.util.Scanner;

public class OrderTwoInts {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter a number:");
		num1 = in.nextInt();
		System.out.println("Enter another number:");
		num2 = in.nextInt();
		
		if (num1 == num2) {
			System.out.println("The numbers are equal!");
		} else if (num1 > num2) {
			System.out.println(num1 + ", " + num2);
		} else {
			System.out.println(num2 + ", " + num1);
		}
		in.close();
	}

}
