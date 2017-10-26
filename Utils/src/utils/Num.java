/*
 * Programmer: Jeffrey Meng
 * Date: Oct 25, 2017
 * Purpose:
 */

package utils;

public class Num {
	public static String getSuffix(int num) {
		//if the number in the 10's digit is 1, return th(11th, 111th, 4812th)
		if (num % 100 - num % 10 == 10) {
			return "th";
		} else {
			//check the number in 
			switch (num % 10) {
			case 1:
				return "st";
			case 2:
				return "nd";
			case 3:
				return "rd";
			default:
				return "th";
			}
		}
		
	}
}