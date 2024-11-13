package com.kodnest.programming;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Str1 :");
		String Str1 = scan.nextLine();
		System.out.println("Enter the Str2 :");
		String Str2 = scan.nextLine();
		Question4 obj = new Question4();
		String result = obj.joinStrings(Str1,Str2);
		System.out.println("The Concatenation of of Two Strings is " + result);

	}

}
