/*
 * Programmer: Jeffrey Meng
 * Date: Oct 11, 2017
 * Purpose:
 */

package forLoops;

import java.util.Scanner;

public class SaluteToPets {

	public static void main(String[] args) {
		String name;
		int number, orientation;
		Scanner in = new Scanner(System.in);
		System.out.println("What is the name of your favorite pet?");
		name = in.nextLine();
		System.out.println("How many times would you like to see the name appear on the screen?");
		number = in.nextInt();
		while (number < 0) {
			System.out.println("Please enter a non-negative number:");
			number = in.nextInt();
		}
		in.nextLine();
		System.out.println("Would you like to see the name (1) once per line, or (2) arranged horizontally?(1 or 2)");
		orientation = in.nextInt();
		if (orientation == 1)
			name = name + "\n";
		for (int i = 0; i < number; i ++) {
			System.out.print(name);
		}
		in.close();
		

	}

}
