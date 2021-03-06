/*
 * Programmer: Jeffrey Meng
 * Date: Jan 25, 2018
 * Purpose:
 */

package bankAccount;

public class Customer {
	String name;
	int id;
	int yearsOfService;
	SavingsAccount savingsAccount;
	CheckingAccount checkingAccount;
	public Customer() {
		//this is bad, we want them to use the other constructor.
		name = "";
		id = -1;
		yearsOfService = -1;
		savingsAccount = new SavingsAccount();
		checkingAccount = new CheckingAccount();
	}
	public Customer(String name, int id, int yearsOfService) {
		this.yearsOfService = yearsOfService;
		this.name = name;
		this.id = id;
		
		
	}
	public Customer(String name, int id, int yearsOfService, SavingsAccount savingsAccount, CheckingAccount checkingAccount) {
		this.yearsOfService = yearsOfService;
		this.name = name;
		this.id = id;
		this.savingsAccount = savingsAccount;
		this.checkingAccount = checkingAccount;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public int getYearsOfService() {
		return yearsOfService;
	}
	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	public void incrementYearsOfService(int incrementAmt) {
		yearsOfService = yearsOfService + incrementAmt;
	}
	
	public SavingsAccount getSavingAccount() {
		return savingsAccount;
	}
	public void setSavingsAccount(SavingsAccount savingAccount) {
		this.savingsAccount = savingAccount;
	}
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	
	
}
