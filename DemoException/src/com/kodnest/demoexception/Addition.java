package com.kodnest.demoexception;

public class Addition {

	public static void main(String[] args) {
		try {
		int a = 10;
		int b = 0;
		
		int sum = a / b;
		
		
		System.out.println("sum: " + sum);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
