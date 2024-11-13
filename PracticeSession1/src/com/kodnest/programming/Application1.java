package com.kodnest.programming;

import java.util.Scanner;

public class Application1 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1 :");
		long num1 = scan.nextLong();
		System.out.println("Enter the num2 :");
		long num2 = scan.nextLong();
		Question1 obj = new Question1();
		long result = obj.galacticAddition(num1,num2);
		System.out.println("The sum of Two Numbers is " + result);

	}
	
	

}
