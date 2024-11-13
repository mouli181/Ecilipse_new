package com.kodnest.programming;

import java.util.Scanner;

public class Application9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value :");
		int num = scan.nextInt();
		Question9 obj = new Question9();
		int result = obj.cubeNumber(num);
		System.out.println("Cube of the Number is " + result );

	}

}
