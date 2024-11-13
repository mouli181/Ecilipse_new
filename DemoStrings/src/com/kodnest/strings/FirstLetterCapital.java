package com.kodnest.strings;

public class FirstLetterCapital {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println((str.charAt(0)+"").toUpperCase() + str.substring(1));

	}

}
