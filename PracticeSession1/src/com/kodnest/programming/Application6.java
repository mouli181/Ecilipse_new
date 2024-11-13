package com.kodnest.programming;

import java.util.Scanner;

public class Application6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit :");
		double f = scan.nextDouble();
		Question6 obj = new Question6();
		double result = obj.fahrenheitToCelsius(f);
		System.out.println("Temperature in Fahrenheit and converts it to Celsius is " + result );

	}

}
