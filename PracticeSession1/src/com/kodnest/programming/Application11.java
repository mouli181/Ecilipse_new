package com.kodnest.programming;

import java.util.Scanner;

public class Application11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		double r = scan.nextDouble();
		Question11 obj = new Question11();
		double result = obj.calculateSurfaceArea(r);
		System.out.println("The Surface area is " + result);
	}

}
