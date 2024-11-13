package com.kodnest.strings;

import java.util.Scanner;

public class MultiplicationOfTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = s.nextInt();
		
		multiply(number);

	}
	public static void multiply(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(i + " * " + number + " = " + (number * i));
		}
	}

}
