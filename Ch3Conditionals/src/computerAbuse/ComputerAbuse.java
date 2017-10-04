/*
 * Programmer: Jeffrey Meng
 * Date: Oct 4, 2017
 * Purpose: A program to help determine fines for computer abuse.
 */
package computerAbuse;

import java.util.Scanner;


public class ComputerAbuse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String investigator, offender;
		int offense;
		
		System.out.println("******* Federal Bureau of Investigation *******");
		System.out.println("Computer Abuse fine calculator");
		
		System.out.println("Investigator:");
		investigator = in.nextLine();
		System.out.println("Offender:");
		offender = in.nextLine();
		in.nextInt();
		System.out.println("\t\t\tWhat cruelty offense did you observe? Here are the choices:");
		System.out.println("\t\t\t\t1. Name calling at the computer.            ( $49.95)");
		System.out.println("\t\t\t\t2. Finger shaking at the computer.          ( $49.95)");
		System.out.println("\t\t\t\t3. Yelling loudly at the computer.          ($149.95)");
		System.out.println("\t\t\t\t4. Physically attacking at the computer.    ($499.95)");
		System.out.println("\n\t\t\t(Enter a number):");
		offense = in.nextInt();
		
		in.close();
	}

}