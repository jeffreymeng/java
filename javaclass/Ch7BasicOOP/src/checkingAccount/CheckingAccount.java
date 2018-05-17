/*
 * Programmer: Jeffrey Meng
 * Date: Dec 15, 2017
 * Purpose:
 */

package checkingAccount;

public class CheckingAccount {
	private double balance;
	
	public CheckingAccount() {
		balance = 0.0;
	}
	public CheckingAccount(double amt) {
		balance = amt;
	}
	public double getBalance() {
		return balance;
	}
	public void processDeposit(double amt) {
		balance += amt;
	}
	public void processCheck(double amt) {
		balance -= amt;
	}
	
	
}
