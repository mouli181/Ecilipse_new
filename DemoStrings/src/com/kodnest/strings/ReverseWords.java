package com.kodnest.strings;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the String");
//		String str = scan.nextLine();
//		char[] ch = str.toCharArray();
//		
//		int left = 0;
//		int right = ch.length-1;
//		if(ch[left]!=32 && ch[right]!=32) {
//			char temp = ch[left];
//			ch[left] = ch[right];
//			ch[right] = temp;
//			left++;
//			right--;
//			
//		}
//		else if(ch[left]==32){
//			left++;
//		}
		String s1 = "Hello Java Programs";
		//avaJo lleH

		char[] ch= s1.toCharArray();

		int i = 0;
		int j = ch.length-1;

		while(i < j) {
			if(ch[i] != ' ' && ch[j] != ' ') {
				char c = ch[i];
				ch[i] = ch[j];
				ch[j] = c;
				i++;
				j--;
			}
			else if(ch[i] == ' ') {
				i++;
			}
			else {
				j--;
			}
		}
		
		String s = new String(ch);
		System.out.println(s);
		
	}

}
