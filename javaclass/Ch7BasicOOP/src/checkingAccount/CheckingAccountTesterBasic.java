/*
 * Programmer: Jeffrey Meng
 * Date: Dec 15, 2017
 * Purpose:
 */

package checkingAccount;

public class CheckingAccountTesterBasic {
	public static void main(String[] args) {
		CheckingAccount bob = new CheckingAccount();
		CheckingAccount mary = new CheckingAccount(50.0);
		
		System.out.printf("bob: %.2f%n", bob.getBalance());
		System.out.printf("mary: %.2f%n", mary.getBalance());
		mary.processCheck(40);
		bob.processDeposit(20);
		bob.processCheck(5);
		System.out.printf("bob: %.2f%n", bob.getBalance());
		System.out.printf("mary: %.2f%n", mary.getBalance());
		
	}
}
