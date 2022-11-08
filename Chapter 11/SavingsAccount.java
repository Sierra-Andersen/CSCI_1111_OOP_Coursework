/*
 * Author: Sierra Andersen
 * Date: 7 Nov 2022
 * 
 * This class simulates a Savings Account that cannot be overdrawn (subclass of Account).
 */
public class SavingsAccount
		extends Account {
	SavingsAccount(){
	}
	
	@Override
	public void withdraw(double amount) {
		if(this.getBalance()>= amount) {
			this.setBalance(this.getBalance()-amount);
		}
		else
			System.out.println("Insufficient funds. Money cannot be withdrawn.");
	}
	
	@Override
	public String toString() {
		
		return "Account type: Savings " + " balance: " + this.getBalance() + " Monthly Interest Rate: " + this.getMonthlyInterestRate() + " Date Created: " + this.getDateCreated();
	}
}
