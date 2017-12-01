/*
 * Utility Package: Strings
 * Jeffrey Meng
 */

package utils;

public class Str {
	// to save some space instead of copying and pasting I'll invoke this method
	// which contains the code
	// this allows me to accept multiple parameters with a smaller file.
	private static void repeatCharBase(String s, int count, boolean newLine) {
		for (int i = 0; i < count; i++) {
			System.out.print(s);
		}
		if (newLine) {
			System.out.println("");
		}
	}

	public static void repeatChar(char c, int count) {
		repeatCharBase(String.valueOf(c), count, true);
	}

	public static void repeatChar(String c, int count) {
		repeatCharBase(c, count, true);
	}

	public static void repeatChar(char c, int count, boolean newLine) {
		repeatCharBase(String.valueOf(c), count, newLine);
	}

	public static void repeatChar(String c, int count, boolean newLine) {
		repeatCharBase(c, count, newLine);
	}

	public static String formatDollar(String num) {
		
		if (num.indexOf(".") > -1) {
			String whole = num.substring(0, num.indexOf("."));
			String decimal = num.substring(num.indexOf(".") + 1);

			switch (decimal.length()) {
			case 1:
				decimal = decimal + "0";
				break;
			case 0:
				decimal = decimal + "00";
				break;
			}
		} else {
			return num = ".00";
		}
		// accepts a string number e.g. 4 or 4.6
		// returns formatted as money: 4.00 or 4.60

		return "";
	}

}
