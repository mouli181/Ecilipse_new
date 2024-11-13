package com.kodnest.hackerrank;

public class ParseDouble {

	public static void main(String[] args) {
		double d = 6.8795436;
		double d2 = Double.parseDouble(String.format("%3f", d));
		
		System.out.println(d);
		System.out.println(d2);

	}

}
