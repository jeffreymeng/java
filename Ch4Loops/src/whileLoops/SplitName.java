/*
 * Programmer: Jeffrey Meng
 * Date: Oct 6, 2017
 * Purpose: Print each letter of a user's name on a line, then tell them how many letters are in their name.
 */

package whileLoops;

import java.util.Scanner;

public class SplitName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int i = 0;//index of loop
		
		System.out.println("Enter your first name:");
		name = in.nextLine();
		
		while(i < name.length()) {
			System.out.println((i + 1) + ". " + name.charAt(i));
			i ++;
		}
		System.out.println(name + ", there are " + name.length() + " letters in your first name.");
		
		in.close();
	}

}
