package dictionary;

import java.io.File;
import java.util.Scanner;

class WordValidation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input;
		boolean validateAgain = true;

		validate();
		
		while(validateAgain) {
			System.out.print("Validate another word? (Y)es/(n)o: ");
			input = in.nextLine();
			if (input.equalsIgnoreCase("y")) {
				validate();	
			} else {
				validateAgain = false;
				break;
			}
			
		}		
		

	}

	public static void validate() {
		Scanner in, reader;
		String filepath = "words.txt";
		File file;
		in = new Scanner(System.in);
		System.out.println("Enter a word:");
		String input = in.nextLine();
		try {
			file = new File(filepath);
			reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				if (line.equals(input)) {
					System.out.println("That's a word!");
					in.close();
					return;
				}
			}
			System.out.println("That's NOT a word!");
			in.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}


	}


} 
