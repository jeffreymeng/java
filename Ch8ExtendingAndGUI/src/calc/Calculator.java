/*
 * Programmer: Jeffrey Meng
 * Date: Jan 19, 2018
 * Purpose:
 */

package calc;

public class Calculator extends Calculation{
	public int mutiply(int x, int y) {
		return x * y;
	}
	public int divide(int x, int y) {
		return x / y;
	}
	public int add(int x, int y) {
		//just to show that it overrides
		return 1 + 1;
	}
}
