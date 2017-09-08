/*
 * Programmer: Jeffrey Meng
 * Date: 9/6/17
 * Purpose: Take a string, give the length and the fourth character.
 */

package stringExercises;

import java.util.Scanner;

public class SentenceData {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sentence;
		
		System.out.println("Enter a sentence:");
		sentence = in.nextLine();
		
		System.out.println("Sentence length: " + sentence.length() + " charcters");
		System.out.println("The fourth charcter in your sentence is \"" + sentence.charAt(4) + "\".");

		in.close();
	}

}

