/*
 * Author: Sierra Andersen
 * Date: 31 Oct 2022
 * 
 * This is a class that simulates an account with ids, balances, and interest rates.
 */

import java.util.Date;

public class Account {
	
	//Data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account(){
	}
	
	public Account(int newId, double newBalance){
		
		id = newId;
		balance = newBalance;
	}
	
	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	public void setBalance(double balance) {
		
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		
		return annualInterestRate/12.0;
	}
	
	public double getMonthlyInterest() {
		
		return balance*(this.getMonthlyInterestRate()/100.0);
	}
	
	public void withdraw(double amount) {
		
		balance -= amount;
	
	}
	
	public void deposit(double amount) {
		
		balance += amount;
	
	}
}
