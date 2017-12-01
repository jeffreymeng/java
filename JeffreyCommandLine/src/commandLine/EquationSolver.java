/*
 * Programmer: Jeffrey Meng
 * Date: Oct 10, 2017
 * Purpose: Solves equations
 */

package commandLine;

import java.util.Arrays;
import java.util.Scanner;

public class EquationSolver {

	public static void main(String[] args) {
		/*
		 * When we learn classes and methods:
		 * Class command
		 *  method contains
		 *  method flags
		 * Class package
		 * 
		 * write licenses to external file
		 */
		System.out.println("============ Jeffrey Command Line ============");
		System.out.println("Initalizing...");
		String command, commandString;
		Scanner in = new Scanner(System.in);

		System.out.println("Initalization Complete");
		System.out.println("============ Jeffrey Command Line ============");
		System.out.println("Feature of the day - Equation solver(Free)");
		do {

			System.out.println("Enter help, quit or any avaliable command:");
			commandString = in.nextLine();
			if (commandString.indexOf(" ") > -1)
				command = commandString
						.substring(0, commandString.indexOf(" "));
			else
				command = commandString;
			switch (command) {
			case "help":
				System.out
						.println("Help\n========\nFor more detailed information "
								+ "on a command, "
								+ "enter the command name and pass --help as an argument(commnad --help)"
								+ "\nAvaliable Commands:");
				// help
				System.out.println("help: get help and a lost of commands");
				// download
				System.out
						.println("download: license and download a feature to your account");
				// store
				System.out.println("store: search licensable packages");
				// quit
				System.out.println("quit: End the program");
				break;
			case "quit":
				System.out.println("Quitting...");
				break;
			}
			if (command.equals("quit")) {
				if (Arrays.asList(
						command.substring(command.indexOf(" ")).split(" "))
						.contains("--help")) {
					System.out
							.println("Quit command help: the quit command('quit') quits the program, "
									+ "except when the --help flag is used, which returns this help message.");
				} else {
					break;
				}
			}
		} while (command != "quit");
		System.out.println("Closing threads...");
		System.out
				.println("Command line quitted. If you did not initiate this, please "
						+ "report this bug.");
		in.close();
	}
}
