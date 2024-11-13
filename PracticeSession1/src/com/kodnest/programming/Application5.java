package com.kodnest.programming;

import java.util.Scanner;

public class Application5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Vehicle Speed ");
		double s = scan.nextDouble();
		System.out.println("Enter the Vehicle Time ");
		double t = scan.nextDouble();
		Question5 obj = new Question5();
		double result = obj.calculateDistance(s,t);
		System.out.println("The Vehicle Distance is " + result);
	}

}
