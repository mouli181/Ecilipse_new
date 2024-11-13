package com.kodnest.programming;

import java.util.Scanner;

public class Application10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character :");
		char ch = scan.next().charAt(0);;
		Question10 obj = new Question10();
		int result = obj.decodeCharacter(ch);
		System.out.println("The Unicode of given value is " + result );


	}

}
