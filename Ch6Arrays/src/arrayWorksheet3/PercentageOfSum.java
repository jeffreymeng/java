/*
 * Programmer: Jeffrey Meng
 * Date: Nov 16, 2017
 * Purpose: Get an array from the user. Obtain the sum and state what percentage of the sum each value is.
 */

package arrayWorksheet3;

import java.util.Scanner;

public class PercentageOfSum {

	public static void main(String[] args) {
		int quantity, sum = 0;
		int[] nums;
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Enter the number of numbers you plan to enter: ");
		quantity = in.nextInt();
		while (quantity < 1) {
			System.out.print("Enter a integer one or greater:");
			quantity = in.nextInt();
		}
		
		nums = new int[quantity];
		
		System.out.println("\nPlease enter the " + quantity + " integers(seperate with newline):");
		for (int i = 0; i < quantity; i ++) {
			nums[i] = in.nextInt();
			sum += nums[i];
			
		}
		
		System.out.println("\nThe sum or your numbers is " + sum + ".\n");
		System.out.println("Statistics: ");
		for (int i = 0; i < quantity; i ++) {
			System.out.printf(nums[i] + " is %.1f%% of the sum.%n", ((double) nums[i] / sum) * 100);
			
		}
		
		in.close();
		
	}

}
