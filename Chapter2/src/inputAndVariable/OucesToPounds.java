/*
 * Programmer: Jeffrey Meng
 * Date: 8/31/17
 * Purpose: To convert a ounces to ounces and pounds.
 */
package inputAndVariable;

import java.util.Scanner;

public class OucesToPounds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a weight in ounces");
		int ounces = in.nextInt();
		
		System.out.println(ounces / 16 + " pounds and " + ounces % 16 + " ounces.");
		
		in.close();
	}
}
