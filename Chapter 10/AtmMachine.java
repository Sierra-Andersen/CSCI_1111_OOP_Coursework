/*
 * Author: Sierra Andersen
 * Date: 2 Nov 2022
 * 
 * This program simulates an ATM machine with 10 accounts with an initial balance of $100.
 */

import java.util.Scanner;

public class AtmMachine {



	public static void main(String[] args) {

		//Create an array of 10 accounts with a balance of $100.
		Account[] atm = new Account[10];
		for(int i = 0; i<atm.length; i++) {
			atm[i] = new Account(i, 100);
		}

		//Prompt user for account number
		int id = -1;
		Scanner input = new Scanner(System.in);
		while(atm.length>0) {
			System.out.println("Enter an account id: ");
			id = input.nextInt();

			if(id >= 0 && id <= 9) {
				int option = -1;
				do {
					System.out.println("Main Menu:");
					System.out.println("1. Check balance");
					System.out.println("2. Withdraw");
					System.out.println("3. Deposit");
					System.out.println("4. Exit");
					System.out.println("Type a number(1-4) to select a menu option.");
					option = input.nextInt();

					switch(option) {
					case 1: 
						System.out.printf("The balance is: $%.2f \n", atm[id].getBalance());
						break;
					case 2:
						System.out.println("Amount to withdraw: ");
						double withdraw = input.nextDouble();
						if(withdraw > atm[id].getBalance())
							System.out.println("You don't have that much money.");
						else
							atm[id].withdraw(withdraw);
						break;

					case 3:
						System.out.println("Amount to deposit: ");
						double deposit = input.nextDouble();
						atm[id].deposit(deposit);
						break;

					case 4: break;

					default: System.out.println("That's not a menu option! Try again.");
					break;
					}
				}while(option!=4);
			}
		}
	}

}
