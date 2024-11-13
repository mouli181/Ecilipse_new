package com.kodnest.programming;

import java.util.Scanner;

public class Application12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Height of the player : ");
		double h = scan.nextDouble();
		Question12 obj = new Question12();
		double result = obj.convertInchesToFeet(h);
		System.out.println("The Height in feet is " + result);


	}

}
