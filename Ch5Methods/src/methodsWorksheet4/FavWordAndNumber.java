/*
 * Programmer: Jeffrey Meng
 * Date: Oct 30, 2017
 * Purpose:
 */

package methodsWorksheet4;

import java.util.Scanner;

public class FavWordAndNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word;
		int num;
		System.out.println("What is your favorite word?");
		word = in.nextLine();
		System.out.println("What is your favorite number?");
		num = in.nextInt();
		repeatLine(word, num);
		in.close();
	}
	public static void repeatLine(String word, int num) {
		for (int i = 0; i < num; i ++) {
			System.out.println(word);
		}
	}

}
