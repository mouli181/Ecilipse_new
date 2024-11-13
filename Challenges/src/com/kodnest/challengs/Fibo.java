package com.kodnest.challengs;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number for fibonacci series");
		int n = s.nextInt();
		
		System.out.println("The fibonacci series for " + n + " is");
		for(int i=0;i<n;i++) {
			System.out.print(fibo(i) + " ");
		}
	}
	public static int fibo(int n) {
		if(n <= 1) {
			return n;
		}
		int start = 0;
		int next = 1;
		for(int i=2;i<=n;i++) {
			int last = start + next;
			start = next;
			next = last;
		}
		return next;
	}

}
