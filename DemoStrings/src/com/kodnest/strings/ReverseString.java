package com.kodnest.strings;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Mouli";
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.print(s.charAt(i)+ " ");
		}

	}

}
