package dictionary;

import java.io.file;
import java.util.Scanner;

class WordValidation {

	public static void main(String[] args) {
		Scanner in, reader;
		String filepath = "src/words.txt";
		File file;
		in = new Scanner(System.in);
		System.out.println("Enter a word:");
		String input = in.nextLine();
		try {
			file = new File(filepath);
			reader = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
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
