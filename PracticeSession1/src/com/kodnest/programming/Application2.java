package com.kodnest.programming;

import java.util.Scanner;

public class Application2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1 :");
		int num1 = scan.nextInt();
		System.out.println("Enter the num2 :");
		int num2 = scan.nextInt();
		Question2 obj = new Question2();
		
		int result1 = obj.subtractNumbers(num1,num2);
		int result2 = obj.multiplyNumbers(num1,num2);
		double result3 = obj.divideNumbers(num1,num2);
		int result4 = obj.findRemainder(num1,num2);
		System.out.println("The Subtract of Two Numbers is " + result1);
		System.out.println("The Multiply of Two Numbers is " + result2);
		System.out.println("The Division of Two Numbers is " + result3);
		System.out.println("The Remainder of Two Numbers is " + result4);
		


	}

}
