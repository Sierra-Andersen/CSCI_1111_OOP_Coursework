/*
 * Author: Sierra Andersen
 * Date: 31 Oct 2022
 * 
 * This program tests the Account class
 */
public class Exercise9_7 {

	public static void main(String[] args) {
		
		//Create an account
		Account a = new Account(1122, 20000);
		a.setAnnualInterestRate(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		
		System.out.println("Account Information: ");
		System.out.printf("Balance: $%.2f \n", a.getBalance());
		System.out.printf("Monthly Interest: $%.2f \n", a.getMonthlyInterest());
		System.out.println("Date Created: " + a.getDateCreated());
		

	}

}
