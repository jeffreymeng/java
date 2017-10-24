/*
 * Programmer: Jeffrey Meng
 * Date: Oct 24, 2017
 * Purpose: Take two integers. Square both, then add them.
 */

package methodsWorksheet1;

public class SquareInt {

	public static void main(String[] args) {
		squareAdd(2, 2);

	}
	public static void squareAdd(int x, int y) {
		System.out.println(Math.pow(x, 2) + Math.pow(y,  2));
	}

}
