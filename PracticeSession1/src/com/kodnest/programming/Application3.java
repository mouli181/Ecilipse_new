package com.kodnest.programming;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1 :");
		int num1 = scan.nextInt();
		Question3 obj = new Question3();
		int result = obj.doubleTheNumber(num1);
		System.out.println("Double the Number is " + result );
		
	}

}
