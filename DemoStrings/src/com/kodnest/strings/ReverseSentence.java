package com.kodnest.strings;

import java.util.Scanner;

public class ReverseSentence {
	public static void reverseString(String input) {
		String s = new String(input);
		String[] split = s.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i] + " ");
		}
	}
	

	public static void main(String[] args) {
//		String str = "Hello java program";
//		String[] split = str.split(" ");
//		for(int i=split.length-1;i>=0;i--) {
//			System.out.print(split[i] + " ");
//		}
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = s.nextLine();
		reverseString(input);

	}

}
