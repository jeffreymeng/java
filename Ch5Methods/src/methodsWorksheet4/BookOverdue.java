/*
 * Programmer: Jeffrey Meng
 * Date: Oct 30, 2017
 * Purpose:
 */

package methodsWorksheet4;

import java.util.Scanner;
import utils.Num;

public class BookOverdue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int days;
		System.out.println("How many days late is the book?");
		days = in.nextInt();
		calculateFine(days);
		
		in.close();
	}
	public static void calculateFine(int days) {
		if (days > 10) {
			System.out.print("WAY OVERDUE: ");
		}
		System.out.println("$" + Num.formatToString( days * 0.15, "0.00") + " fine.");
	}
}
