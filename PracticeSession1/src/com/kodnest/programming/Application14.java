package com.kodnest.programming;

import java.util.Scanner;

public class Application14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Time : ");
		int  minutes = scan.nextInt();
		Question14 obj = new Question14();
		double result = obj.convertToHours(minutes);
		System.out.println("The Time in Hours is " + result);

	}

}