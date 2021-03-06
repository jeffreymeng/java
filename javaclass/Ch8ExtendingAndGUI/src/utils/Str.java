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

		return Num.formatToString(Integer.parseInt(num), "0.00");
	}

	

}
