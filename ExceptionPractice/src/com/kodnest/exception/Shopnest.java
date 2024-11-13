package com.kodnest.exception;

import java.util.Scanner;

public class Shopnest {

	public static void main(String[] args) {
		
		try {
			shop();
		}
		catch(Exception e) {
			System.out.println("Payment is failure, try again");
			//throw e;
		}

	}

	public static void shop() {
		try {
			pay();
			System.out.println("Thank you for Shopping");
		}
		catch(Exception e) {
			System.out.println("Shopping not completed, try again");
			throw e;
		}
	}
	public static void pay() {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter amount: ");
			int amt = s.nextInt();
			System.out.println("Payment successful - INR " + amt);
		}
		catch(Exception e) {
			System.out.println("Payment not completed!");
			throw e;
		}
		
		
		
		
	}

}
