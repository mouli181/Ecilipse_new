package com.kodnest.strings;

public class SpaceInChar {

	public static void main(String[] args) {
		String s = "Programming";
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+ " ");
		}
		
		System.out.print("+++++++++");
		int j = 0;
		while(j<s.length()) {
			System.out.println(s.charAt(j) + " ");
			j++;
		}

	}

}
