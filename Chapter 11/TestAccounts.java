/*
 * Author: Sierra Andersen
 * Date: 7 Nov 2022
 * 
 * This tests the SavingsAccount and CheckingAccount classes.
 */
public class TestAccounts {

	public static void main(String[] args) {
		Account a1 = new Account(2, 1500.25);
		SavingsAccount s1 = new SavingsAccount();
		CheckingAccount c1 = new CheckingAccount(100.00);
		
		System.out.println(a1.toString());
		System.out.println(s1.toString());
		System.out.println(c1.toString());

	}

}
