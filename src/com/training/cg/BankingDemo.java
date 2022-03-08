package com.training.cg;

public class BankingDemo {
	public static void main(String args[]) {
		
		SavingAccount s1 = new SavingAccount(5000);
		s1.deposit(5000);
		s1.withdraw(300);
		System.out.println(s1.checkBalance);
		}
	}


