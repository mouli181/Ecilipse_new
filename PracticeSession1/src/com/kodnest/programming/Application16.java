package com.kodnest.programming;

import java.util.Scanner;
import java.lang.Math;

public class Application16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Throttle setting value : ");
		int num = scan.nextInt();
		Question16 obj = new Question16();
		long result = obj.calculateThrust(num);
		System.out.println("The Throttle setting to the fifth power of Value is " + result);

	}

}
