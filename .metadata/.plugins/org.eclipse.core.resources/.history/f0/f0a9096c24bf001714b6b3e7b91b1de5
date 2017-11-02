/*
 * Utility Package: Numbers
 * Jeffrey Meng
 */

package utils;

import java.text.DecimalFormat;

public class Num {
	/*
	 * The utils.Num class supports Doubles, Floats, and Integers
	 * 
	 * 
	 */
	/**
	 * Get suffix returns the string suffix for an number.
	 * 
	 * @param num
	 * @return string suffix(st, nd, rd, or th)
	 */
	/*
	 * Formatting rules:
	 * If the number in the tens place is 1, return th(113th, 111th)
	 * Else, if the number in the ones place is 1, 2, or 3 return a special string(st, nd, or rd) else return th.
	 */
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
	public static String formatToString(double number) {
		return Double.toString(number);
	}
	public static String formatToString(int number) {
		return Integer.toString(number);
	}
	public static String formatToString(float number) {
		return Float.toString(number);
	}
	public static String formatDollar(double num) {

		return Num.formatToString(num, "0.00");
	}
	public static String formatDollar(int num) {

		return Num.formatToString(num, "0.00");
	}
	public static String formatDollar(float num) {

		return Num.formatToString(num, "0.00");
	}
	

}
