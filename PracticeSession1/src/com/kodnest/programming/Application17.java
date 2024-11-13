package com.kodnest.programming;

import java.util.Scanner;

public class Application17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Side Ploat Area of Length : ");
		int sideLength1 = scan.nextInt();
		System.out.println("Enter the Side Ploat Area of Length: ");
		double sideLength2 = scan.nextDouble();
		Question17 obj = new Question17();
		System.out.println("The Area is " + obj.calculatePlotArea(sideLength1));
		System.out.println("The Area is " + obj.calculatePlotArea(sideLength2));
		
		
	}

}
