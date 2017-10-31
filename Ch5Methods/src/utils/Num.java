/*
 * Utility Package: Numbers
 * Jeffrey Meng
 */

package utils;

import java.text.DecimalFormat;

public class Num {
	public static String getSuffix(int num) {
		// if the number in the 10's digit is 1, return th(11th, 111th, 4812th)
		if (num % 100 - num % 10 == 10) {
			return "th";
		} else {
			// check the number in
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

	public static String formatToString(double number, String format) {
		return new DecimalFormat(format).format(number);
	}
	public static String formatToString(int number, String format) {
		return new DecimalFormat(format).format(number);
	}
	public static String formatToString(float number, String format) {
		return new DecimalFormat(format).format(number);
	}


}
