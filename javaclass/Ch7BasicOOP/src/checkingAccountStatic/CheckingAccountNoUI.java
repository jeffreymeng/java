/*
 * Programmer: Jeffrey Meng
 * Date: Dec 14, 2017
 * Purpose:
 */

package checkingAccountStatic;

public class CheckingAccountNoUI {

	public static void main(String[] args) {
		System.out.printf("%.2f%n", CheckingAccount.getBalance());
		CheckingAccount.processDeposit(10.00);
		System.out.printf("%.2f%n", CheckingAccount.getBalance());
		CheckingAccount.processCheck(4.75);
		System.out.printf("%.2f%n", CheckingAccount.getBalance());
		

	}

}
