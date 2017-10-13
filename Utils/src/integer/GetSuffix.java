/*
 * Programmer: Jeffrey Meng
 * Date: Oct 11, 2017
 * Purpose:
 */

package integer;

public class GetSuffix {

	public static void main(String[] args) {
		//TOdo: make method
		int num = 122;
		String suffix;
		if (num % 100 - num % 10 == 10) {
			suffix = "th";
		} else {
			switch (num % 10) {
			case 1:
				suffix = "st";
				break;
			case 2:
				suffix = "nd";
				break;
			case 3:
				suffix = "rd";
				break;
			default:
				suffix = "th";
			}
		}
		System.out.println(num + suffix);

	}

}
