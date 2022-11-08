/*
 * Author: Sierra Andersen
 * Date: 7 Nov 2022
 * 
 * This class simulates a checking account that has an overdraft fee (subclass of Account).
 */
public class CheckingAccount 
		extends Account {
	//Withdraw limit
	private double limit = 0.0;
	
	//Construct default CheckingAccount
	CheckingAccount(){
	}
	
	//Construct CheckingAccount with overdraft limit
	CheckingAccount(double limit){
		this.limit = limit;
	}
	
	//Get overdraft limit for the account
	public double getLimit() {
		return limit;
	}
	
	@Override
	public void withdraw(double amount) {
		if(this.getBalance()+limit>= amount) {
			this.setBalance(this.getBalance()-amount);
		}
		else
			System.out.println("This amount exceeds your overdraft limit. You cannot withdraw that amount.");
		
	}
	
	@Override
	public String toString() {
		
		return "Account type: Checking " + " balance: " + this.getBalance() + " Monthly Interest Rate: " + this.getMonthlyInterestRate() + " Overdraft limit: " + limit + " Date Created: " + this.getDateCreated();
	 }

}
