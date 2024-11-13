 package com.kodnest.challengs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number for fibonacci series");
		int n = s.nextInt();
		
		System.out.println("The fibonacci series for " + n + " is");
		for(int i=0;i<n;i++) {
			System.out.print(fibonacci(i) + " ");
		}
		
	}

	public static int fibonacci(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	

}
