/*
 * Programmer: Jeffrey Meng
 * Date: May 8, 2018
 * Purpose: Read from a list of words
 */
package dictionary;

import java.io.File;
import java.util.Scanner;

class WordValidation {
	private static String[] wordlist;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner reader;		
		String input;
		String filepath = "words.txt";
                File file;
		int lines = 0;
		boolean validateAgain = true;
		System.out.println("WordValidation v2.0.0");
		System.out.print("Calculating time remaning...\r");
		try {
                        file = new File(filepath);
                        reader = new Scanner(file);
                        while (reader.hasNextLine()) {
                        	lines++;
			}
               		reader.close(); 
                } catch (Exception ex) {
                        ex.printStackTrace();
                }

		wordlist = new String[lines];
                System.out.print("  0% |                    |\r");

                try {
                        file = new File(filepath);
                        reader = new Scanner(file);
			int currentLine = 0;
                        while (reader.hasNextLine()) {
		                System.out.print("  0% |==                  |\r");

                                String line = reader.nextLine();
				wordlist[currentLine++] = line;
				//the variable++ increments the variable, then
				//returns the value of the variable BEFORE incrementing

                        	
			}
                        reader.close();

                } catch (Exception ex) {
                        ex.printStackTrace();
                }



		System.out.println("Enter a word:");
                validate(in.nextLine());

		
		while(validateAgain) {
			System.out.print("Validate another word? (Y)es/(n)o: ");
			input = in.nextLine();
			if (input.equalsIgnoreCase("y")) {
				System.out.println("Enter a word:");
				validate(in.nextLine());	
			} else {
				validateAgain = false;
				break;
			}
			
		}		
		in.close();
		

	}

	public static void validate(String word) {
		Scanner reader;
		String filepath = "words.txt";
		File file;
	
		try {
			file = new File(filepath);
			reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				if (line.equals(word)) {
					System.out.println("That's a word!");
					reader.close();
					return;
				}
			}
			reader.close();
			System.out.println("That's NOT a word!");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}


	}


} 
