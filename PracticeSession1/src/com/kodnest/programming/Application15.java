package com.kodnest.programming;

import java.util.Scanner;

public class Application15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		double num = scan.nextDouble();
		Question15 obj = new Question15();
		double result = obj.halveTheNumber(num);
		System.out.println("The Half of the Value is " + result);

	}

}
