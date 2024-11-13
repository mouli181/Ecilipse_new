package com.kodnest.strings;

public class FisrtCap {

	public static void main(String[] args) {
		String s = "hello welcome to all";
		String[] split = s.split(" ");
		System.out.println((s.charAt(0)+"").toUpperCase()+s.substring(1));
		
	}

}
