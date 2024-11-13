package com.kodnest.exception;

import java.util.Scanner;

public class DuckingException {

	public static void main(String[] args)  {
		shop();

	}

	public static void shop() {
		System.out.println("shop");
		pay();
	}
	public static void pay()throws ArithmeticException {
		Scanner s = new Scanner(System.in);
		int a = 10;
		int b = 0;
		System.out.println(a+b);
		System.out.println(a/b);

	}

}
