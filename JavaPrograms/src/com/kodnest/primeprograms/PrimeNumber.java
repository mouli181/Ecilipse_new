package com.kodnest.primeprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int a = s.nextInt();
		if(isPrime(a)) {
			System.out.println(a + " is prime number");
		}
		else {
			System.out.println(a+ " not a prime number");
		}
	}
	public static boolean isPrime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a % i == 0) {
				return false;
			}
			
			
		}
		return true;
	}

}
 