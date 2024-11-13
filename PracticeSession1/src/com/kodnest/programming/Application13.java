package com.kodnest.programming;

import java.util.Scanner;

public class Application13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user! Enter the Principal Amount :");
		double P = scan.nextDouble();
		System.out.println("User! Enter the Rate of Intrest :");
		double R = scan.nextDouble();
		System.out.println("User! Enter the Time in Years :");
		double T = scan.nextDouble();
		Question13 obj = new Question13();
		double result = obj. calculateSimpleInterest(P, R, T);
		System.out.println("The Simple Intrest is " + result);
	}

}
