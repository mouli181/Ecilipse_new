package com.kodnest.strings;

public class PliandromeString {

	public static void main(String[] args) {
		String s = "MAM";
		StringBuffer str = new StringBuffer(s);
		StringBuffer reverse = str.reverse();
		System.out.println(s.equals(reverse.toString()));
	}

}
