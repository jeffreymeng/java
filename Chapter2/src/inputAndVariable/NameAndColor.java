/*
 * Programmer: Jeffrey Meng
 * Date: 9/1/17
 * Purpose: Ask a user's name and favorite color, then print NAME, your favorite color is COLOR.
 */
package inputAndVariable;

import java.util.Scanner;

public class NameAndColor {
	public static void main(String[] args) {
		String name;
		String color;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = in.nextLine();
		System.out.println("Enter your favorite color: ");
		color = in.nextLine();
		
		System.out.println(name + ", your favorite color is " + color + ".");
		
		in.close();
	}
}
