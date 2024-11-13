package com.kodnest.strings;

public class ArrayToString {

	public static void main(String[] args) {
		char[] ch = {'1','2','3','4','5'};
		String s = new String(ch);
		System.out.println(s);
		String str = ch.toString();
		System.out.println(str);
	}

}
