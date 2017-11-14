/*
 * Programmer: Jeffrey Meng
 * Date: Nov 14, 2017
 * Purpose:
 */

package arraysWorksheet1;

import java.util.concurrent.ThreadLocalRandom;

public class RandArray {

	public static void main(String[] args) {
		int[] randArr = new int[10];
		int even = 0;//even nums in array
		
		for (int i = 0; i < randArr.length; i++) {
			randArr[i] = ThreadLocalRandom.current().nextInt(1, 11);// (min, max + 1)

		}
		System.out.print("[");
		for (int i = 0; i < randArr.length; i++) {
			if (i == randArr.length - 1) {
				System.out.print(randArr[i]);

			} else {
				System.out.print(randArr[i] + ", ");
			}
			if (randArr[i] % 2 == 0) {
				even ++;
			}
		}
		System.out.println("]");
		System.out.print("[");
		//could also start from length
		for (int i = 0; i < randArr.length; i++) {
			if (i == randArr.length - 1) {
				System.out.print(randArr[(randArr.length - 1 )- i]);

			} else {
				System.out.print(randArr[(randArr.length - 1 )- i] + ", ");
			}
		}
		System.out.println("]");
		System.out.println("Number of even numbers: " + even);

	}

}
