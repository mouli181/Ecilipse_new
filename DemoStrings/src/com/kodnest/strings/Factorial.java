package com.kodnest.strings;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		
		factorial(a);

	}
	public static void factorial(int a) {
		int res = 1;
		while(a>0) {
			res = res * a;
			a--;
		}
		System.out.println(res);
	}

}
