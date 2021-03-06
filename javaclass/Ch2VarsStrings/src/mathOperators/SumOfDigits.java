/*
 * Programmer: Jeffrey Meng
 * Date: 9/11/17
 * Purpose: Ask the user for a two digit number, then display each digit separately.
 */

package mathOperators;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int number;
		int first;
		int second;
		int third;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a three digit number:");
		number = in.nextInt();
		first = number / 100;
		second = (number - (first * 100))/10;
		third = (number - (first * 100))  % 10;
		System.out.println("The first digit is " + first + ".");
		System.out.println("The second digit is " + second + ".");
		System.out.println("The third digit is " + third + ".");
		System.out.println("The sum of the digits is " + (first + second + third) + ".");
		
		in.close();
		
	}

}