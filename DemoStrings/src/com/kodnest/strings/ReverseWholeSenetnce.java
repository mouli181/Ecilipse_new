package com.kodnest.strings;

import java.util.Scanner;

public class ReverseWholeSenetnce {

	public static void main(String[] args) { 
		//String str = "Hello java program";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		String[] split = str.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			StringBuffer s = new StringBuffer(split[i]);
			
			System.out.print(s.reverse()+" ");
		}

	}

}
 