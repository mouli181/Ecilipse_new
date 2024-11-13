package com.kodnest.interfaces;

import java.util.Scanner;

interface Account {
	void deposit(double amount);
	void withdraw(double amount);
}

class SavingsAccount implements Account{
	private double balance;
	
	public SavingsAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit Successful.Blanace: " + balance);
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawel successful. Balance: " + balance);
		}
		else {
			System.out.println("Insufficient funds. Withdeawel unsuccessful.");
		}
		
	}
	
}
 class Main{
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 double d1 = s.nextDouble();
		 double d2 = s.nextDouble();
		 
		 SavingsAccount s1 = new SavingsAccount(0.0);
		 s1.deposit(d1);
		 s1.withdraw(d2);
		 
	 }
 }

