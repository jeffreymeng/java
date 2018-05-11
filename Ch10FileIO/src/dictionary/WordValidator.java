/*
 * Programmer: Jeffrey Meng
 * Date: May 8, 2018
 * Purpose: Read from a list of words
 */
package dictionary;

import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;

class WordValidator {
	private String[] wordlist;
	private String filepath;
	
	public static void main(String[] args) {
		boolean validateAgain = true;
		String input;
		Scanner in = new Scanner(System.in);
		WordValidator validator = new WordValidator("words.txt");
		validator.init();
				
		System.out.println("\nEnter a word:");
                if( validator.validate(in.nextLine())) {
			System.out.println("That's a word!");

		} else {
			System.out.println("That's NOT a word!");
		}

		
		while(validateAgain) {
			System.out.print("Validate another word? (Y)es/(n)o: ");
			input = in.nextLine();
			if (input.equalsIgnoreCase("y")) {
				System.out.print("Enter a word: ");
				if( validator.validate(in.nextLine())) {
                        		System.out.println("That's a word!");

               			 } else {
                        		System.out.println("That's NOT a word!");
                		}
			} else {
				validateAgain = false;
				break;
			}
			
		}		
		in.close();

	}

	public WordValidator(String path) {

		this.filepath = path;
	}
	public void init() {
		Scanner reader;		
		
                File file;
		int lines = 0;
		System.out.println("WordValidation v2.0.0");
		System.out.print("Calculating time remaning...\r");
		try {
                        file = new File(filepath);
                        reader = new Scanner(file);
                        while (reader.hasNextLine()) {
				reader.nextLine();//consume the line				
				//System.out.println(lines);
                        	lines++;
			}
               		reader.close(); 
                } catch (Exception ex) {
                        ex.printStackTrace();
                }

		wordlist = new String[lines];
                System.out.print(WordValidator.getLoadingStr(0.0));
                try {
                        file = new File(filepath);
                        reader = new Scanner(file);
			int currentLine = 0;
                        while (reader.hasNextLine()) {
		                System.out.print(WordValidator.getLoadingStr((double) currentLine/lines));

                                String line = reader.nextLine();
				wordlist[currentLine] = line;
				currentLine++;
                        	
			}
                        reader.close();
			System.out.print(WordValidator.getLoadingStr(1.0));


                } catch (Exception ex) {
                        ex.printStackTrace();
                }


		System.out.print("\n\n");//add new lines to preserve loading bar
		
		

	}

	public boolean validate(String word) {
		for (int i = 0; i < wordlist.length; i ++) {

			if (wordlist[i].equalsIgnoreCase(word)) {						return true;
			}
		}
		return false;
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
		int numBars = (int) (percent * 20);	
return "  " + percentStr + " |" + repeatStr(fillSym, numBars) + repeatStr(emptySym,  20 - numBars)  +  "|\r     ";

	}
	public static String repeatStr(String str, int count) {
		String result = "";
		//note: this is a very basic implementation, not the most efficient
		// If using java 11+, you can use the string.prototype.repeat() method
		
		if (count == 0) {
			return "";
		}
		for (int i = 0; i < count; i ++) {
			result = result + str;
		}
		return result;

	}
}
