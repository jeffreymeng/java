/*
 * Programmer: Jeffrey Meng
 * Date: May 8, 2018
 * Purpose: Read from a list of words
 */
package dictionary;

import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;

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
reader.nextLine();//consume the line				
System.out.println(lines);
                        	lines++;
			}
               		reader.close(); 
                } catch (Exception ex) {
                        ex.printStackTrace();
                }

		wordlist = new String[lines];
                System.out.print(getLoadingStr(0.0));

                try {
                        file = new File(filepath);
                        reader = new Scanner(file);
			int currentLine = 0;
                        while (reader.hasNextLine()) {
		                System.out.print(getLoadingStr(currentLine/lines));

                                String line = reader.nextLine();
				wordlist[currentLine] = line;
				currentLine++;
                        	
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

	public static String getLoadingStr(double percent) {
		DecimalFormat percentFormatter = new DecimalFormat("00.00%");
		//decimal format 00 makes it so that if a number is present it filles
		//the slot, but if it is not pattern then it shows up as 0
		//percent sign mutiplies by 100 and adds a percent sign
		//in this example: 7.89 -> 07.89%
		String percentStr = percentFormatter.format(percent);
		String fillSym = "=";//the symbol to use when a tick of the bar is filled
		String emptySym = " ";//the symbol to use when a tick of the bar is empty
		return "  " + percentStr + " |" + repeatStr(fillSym, (int) (percent * 20)) + repeatStr(emptySym,  20 - ((int) (percent * 20)))  +  "|\r     ";

	}
	public static String repeatStr(String str, int count) {
		String result = "";
		//note: this is a very basic implementation, not the most efficient
		// If using java 11+, you can use the string.prototype.repeat() method
		for (int i = 0; i < count; i ++) {
			result += str;
		}
		return result;

	}
} 
