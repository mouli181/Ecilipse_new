package com.kodnest.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = s.nextLine();
		System.out.println("Enter the second String");
		String str2 = s.nextLine();
//		String str1="Brag";  
//        String str2="Grab";  
  
        //Converting both the string to lower case.  
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
  
        //Checking for the length of strings  
        if (str1.length() != str2.length()) {  
            System.out.println("Both the strings are not anagram");  
        }  
        else {  
            //Converting both the arrays to character array  
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
  
            //Sorting the arrays using in-built function sort ()  
            Arrays.sort(string1);  
            Arrays.sort(string2);  
  
            //Comparing both the arrays using in-built function equals ()  
            if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  
//		s1 = s1.toLowerCase();
//		s2 = s2.toLowerCase();
//		if(s1.length() != s2.length()) {
//			System.out.println("Not Anagram"); 
//			
//		}
//		else {
//			char[] str1 = s1.toCharArray();
//			char[] str2 = s2.toCharArray();
//			Arrays.sort(str1);
//			Arrays.sort(str1);
//			if(Arrays.equals(str1, str2) == true) {
//				System.out.println("The given Strings are anagrams");
//			}
//			else {
//				System.out.println("Both strings are not anagram");
//			}
//		
//		
//		}
		

	}

}
