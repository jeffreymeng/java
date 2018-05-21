/*
 * Programmer: Jeffrey Meng
 * Date: Oct 27, 2017
 * Purpose:
 */

package methodsWorksheet3;

public class SquareCube {

	public static void main(String[] args) {
		System.out.println(square(4));
		System.out.println(cube(4));

	}
	public static int square(int num) {
		return (int) Math.pow(num, 2);
	}
	public static int cube(int num) {
		return (int) Math.pow(num, 3);
	}

}