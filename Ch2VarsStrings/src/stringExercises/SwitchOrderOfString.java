/*
 * Programmer: Jeffrey Meng
 * Date: 9/6/17
 * Purpose: Assign Jones, Bob to one variable, then use the substring method to print out Bob Jones.
 */
package stringExercises;

public class SwitchOrderOfString {
	public static void main(String[] args) {
		String name = "Jones, Bob";
		System.out.println(name.substring(name.indexOf(',') + 1) + " " + name.substring(0, name.indexOf(',')));
	}
}
