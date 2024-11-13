package com.kodnest.custom;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the amount for withdrawl!");
		int amount = s.nextInt();
		try {
			withdrawl(amount);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e);
		}

	}
	static void withdrawl(int amount) throws MyException{
		int balance = 10000;
		
		if(amount > balance) {
			throw new MyException(); 
		}
	}

}
