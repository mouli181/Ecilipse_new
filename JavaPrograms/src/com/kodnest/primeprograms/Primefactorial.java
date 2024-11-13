package com.kodnest.primeprograms;

import java.util.Scanner;

public class Primefactorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = s.nextInt();
		int prod = 1;
		for(int i=n;i>=1;i--) {
			prod = prod * i;
		}
		System.out.println("The factorial = " + prod);
	}

}
