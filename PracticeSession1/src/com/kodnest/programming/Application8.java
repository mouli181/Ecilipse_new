package com.kodnest.programming;

import java.util.Scanner;

public class Application8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value :");
		int num = scan.nextInt();
		Question8 obj = new Question8();
		int result = obj.sqaureNumber(num);
		System.out.println("Square of the Number is " + result );

	}

}
