/* 
 * Programmer: Jeffrey Meng
 * Date: May 15, 2018
 * Purpose: Sort a list of words given via a file.
 */


import java.io.*;
import java.util.Scanner;

class DictionarySorter {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		
		System.out.print("Enter the name of the file to read from: ");

		String[] wordlist = readFileIntoArray(in.nextLine());
		wordlist = sort(wordlist);//java non-primitive types such as String[] are pass by refrence
		String[] out = new String[wordlist.length + 1];

		//shift everything in the array by one to add a number of words line.
		//TODO: convert wordlist to arraylist so as to not create a new array.
		out[0] = "// Number of words: " + wordlist.length;
		for (int i = 1; i < wordlist.length + 1; i ++) {
			out[i] = wordlist[i - 1];
		}	
		
		System.out.print("Enter the name of the file to write to: ");
		writeArrayIntoFile(in.nextLine(), out);

		in.close();		

	}
	
	public static String[] readFileIntoArray(String path) {
		Scanner reader;
		File file;
		int length = 0;
		try {
			file = new File(path);
			reader = new Scanner(file);
			while (reader.hasNextLine()) {
				reader.nextLine();
				length ++;
			}

			reader = new Scanner(file);//get a fresh reader
			String[] out = new String[length];
			int i = 0;
			while (reader.hasNextLine()) {
				out[i] = reader.nextLine();
				i ++;//array counter				
			}

			reader.close();

			return out;
		} catch (Exception ex) {
			ex.printStackTrace();
		}


		return new String[0];

	}

	public static void writeArrayIntoFile(String path, String... array) {

		File destinationFile;
		PrintWriter writer;
		destinationFile = new File(path); // create the File object
		try {
			writer = new PrintWriter( destinationFile );
			System.out.println("Writing to file...");
		
			for (int i = 0; i < array.length; i ++) {
				writer.println(array[i]);


			}


			System.out.println("Done writing to file.");
			writer.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}



	}


	public static String[] sort(String... arr) { //String... accepts either infinite string parameters, or an array of strings.
		
		//simple lexographic bubble sort, adapted from Ch6Arrays.sortingArray2.AlphabeticalOrder.java
		String[] array = arr;//Duplicate the array to keep the origional intact(java is pass by refrence for non primitive types like String[])
		boolean swapped = true;
		String temp;// for swapping
		while (swapped) {
			swapped = false;
			// go through the array. We will not go through the last element of
			// the array.
			for (int i = 0; i < array.length - 1; i++) {
				// check if the current element is greater than the next
				// element.
				if (array[i].compareTo(array[i + 1]) > 0) {//compares two strings lexicographically
					// if it is, swap the two elements.
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					// set swapped to true so the program knows to make another
					// pass through the array.
					swapped = true;
				}

			}
		}
		return array;


	}


}
 
