package com.kodnest.concat;

import java.util.Scanner;

public class CompareTwo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		String str = s.nextLine();
	
		char[] ch = str.toCharArray(); 
	
		findFrequency(ch);
	
	
	
		
	}
	public static void findFrequency(char[] ch) {
		int j = 0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch == ch)
				j++;
		}
		//System.out.println(ch + j++);
	}
}
