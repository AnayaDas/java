package com.training.cg;

public class AccountType implements Account{
	double INITIALBALANCE;
	double totalBalance;
	double RATEOFINTEREST;
	
	
	public void deposit(double amount) {
		totalBalance += amount;
		
	}
	
	public void withdraw(double amount) {
		if (amount <= totalBalance) {
			totalBalance -= amount;
			
		}
		
		else {
			System.out.println(" Insufficient Balance");		}
		
	}
 
	public double checkBalance() {
		return totalBalance;
	}

}
