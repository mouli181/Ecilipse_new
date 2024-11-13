package com.kodnest.strings;

import java.util.Scanner;

public class StringPalindromerev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		//String s = "madam";
		StringBuffer str = new StringBuffer(s);
		StringBuffer reverse = str.reverse();
		String string = reverse.toString();
		if(s.equals(string)) {
			System.out.println("It is a Pallindrome");
		}
		else {
			System.out.println("It is not a Palinrome");
		}
		

	}

}
