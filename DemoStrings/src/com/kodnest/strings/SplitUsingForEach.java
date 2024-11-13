package com.kodnest.strings;

public class SplitUsingForEach {

	public static void main(String[] args) {
		String s  = "india newzealand";
		
		String[] split = s.split(" ");
		
		for(String element : split) {
			System.out.println(element);
		}
		//System.out.println((s.charAt(0)+"").toUpperCase() + s.substring(1));

	}

}
