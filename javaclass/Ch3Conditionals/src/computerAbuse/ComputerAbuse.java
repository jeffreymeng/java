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
		String investigator, offender, offenseName = "";
		int offense;
		double fine = 0;

		System.out.println("******* Federal Bureau of Investigation *******");
		System.out.println("Computer Abuse fine calculator");

		System.out.println("Investigator:");
		investigator = in.nextLine();
		System.out.println("Offender:");
		offender = in.nextLine();

		System.out
				.println("\t\tWhat cruelty offense did you observe? Here are the choices:");
		System.out
				.println("\t\t\t1. Name calling at the computer.            ( $49.95)");
		System.out
				.println("\t\t\t2. Finger shaking at the computer.          ( $99.95)");
		System.out
				.println("\t\t\t3. Yelling loudly at the computer.          ($149.95)");
		System.out
				.println("\t\t\t4. Physically attacking the computer.       ($499.95)");
		System.out.print("\n\t\t(Enter a number):");
		offense = in.nextInt();

		switch (offense) {
		case 1:
			fine = 49.95;
			offenseName = "name calling at the computer";
			break;
		case 2:
			fine = 99.95;
			offenseName = "finger shaking at the computer";
			break;
		case 3:
			fine = 149.95;
			offenseName = "yelling loudly at the computer";
			break;
		case 4:
			fine = 499.95;
			offenseName = "physically attacking the computer";
			break;

		}
		if (offense < 1 || offense > 4) {
			System.out
					.println("You did not enter an appropriate response. The program is ending.");
		} else {
			if (offender.equals("Donald")) {
				fine = fine * 1.45;
			}
			
			System.out.printf(offender + " should be fined $%.2d for "
					+ offenseName + ".", fine);
			if (offender.equals("Minnie") && investigator.equals("Mickey") && offense >= 3) {
				System.out.println("Fines over $100 cannot be issued aganist a spouse.");
			}
			in.close();
		}
	}

}
