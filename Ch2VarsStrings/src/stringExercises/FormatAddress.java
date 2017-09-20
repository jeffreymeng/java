/*
 * Programmer: Jeffrey Meng
 * Date: 9/5/17
 * Purpose: Ask for the user's name, street, and city state zip. Print information
 * 	as an address, then print the length of the name of the city.
 */
package stringExercises;

import java.util.Scanner;

public class FormatAddress {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name, street, cityStateAndZip, address;
		
		System.out.println("Enter your name:");
		name = in.nextLine();
		System.out.println("Enter your street address:");
		street = in.nextLine();
		System.out.println("Enter your city, state, and zip code:");
		cityStateAndZip = in.nextLine();
		
		address = name + "\n" + street + "\n" + cityStateAndZip;
		System.out.println(address);
		
		System.out.println(cityStateAndZip.substring(0, cityStateAndZip.indexOf(',')).length());
		
		in.close();
		
	}

}
