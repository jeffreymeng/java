/*
 * Programmer: Jeffrey Meng
 * Date: Oct 30, 2017
 * Purpose:
 */

package methodsWorksheet4;

import java.util.Scanner;

public class AddFrom1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num = in.nextInt();
		System.out.println(AddNumFrom1(num));
		
		in.close();

	}
	public static int AddNumFrom1(int num) {
		int result = 0;
		for (int i = 0; i < num; i ++) {
			result += (num - i);
		}
		return result;
	}
	

}
