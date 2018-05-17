/*
 * Programmer: Jeffrey Meng
 * Date: Jan 19, 2018
 * Purpose:
 */

package calc;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("Add: " + calculator.add(6, 3));
		System.out.println("Subtract: " + calculator.subtract(6, 3));
		System.out.println("Mutiply: " + calculator.mutiply(6, 3));
		System.out.println("Divide: " + calculator.divide(6, 3));
	}
}
