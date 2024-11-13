package com.kodnest.demoexception;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bank app started");
		int balance = 15000;
		int pin = 4545;
		System.out.println("Enter the pin");
		try {
			int a = s.nextInt();
			if(a == pin) {
				System.out.println("Balanace is " + balance);
			}
		}
		catch(Exception e) {
			System.out.println("enter the valid pin");
		}
		finally {
			s.close();
			System.out.println("Bank app terminated");
		}
	}

}
