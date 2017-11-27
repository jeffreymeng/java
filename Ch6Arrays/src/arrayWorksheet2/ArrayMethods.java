/*
 * Programmer: Jeffrey Meng
 * Date: Nov 15, 2017
 * Purpose:
 */

package arrayWorksheet2;

import java.util.Scanner;

import utils.Num;

public class ArrayMethods {
	public static void main(String[] args) {
		int[] userData = new int[10];
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < userData.length; i++) {
			System.out.print("Enter the data for the " + (i + 1) + Num.getSuffix(i + 1) + " element: ");
			userData[i] = in.nextInt();
		}
		System.out.println("The first element of the array is " + userData[0]);
		System.out.println("The last element of the array is " + userData[userData.length - 1]);
		printMyArray(userData);
		System.out.println(ArrayAverage(userData));
	}
	public static void printMyArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);

			} else {
				System.out.print(arr[i] + ", ");
			}
			
		}
		System.out.println("]");
	}
	public static double ArrayAverage(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
		}
		return (double) sum / arr.length;
	}
}
