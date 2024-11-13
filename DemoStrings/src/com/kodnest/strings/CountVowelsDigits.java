package com.kodnest.strings;

import java.util.Scanner;

public class CountVowelsDigits {

	public static void main(String[] args) {
//		 	Scanner scanner = new Scanner(System.in);
//
//	        System.out.print("Enter a string: ");
//	        String input = scanner.nextLine();
//
//	        int vowelCount = countVowels(input);
//	        int specialCharCount = countSpecialCharacters(input);
//	        int digitCount = countDigits(input);
//	        int consonantCount = countConsonants(input);
//
//	        System.out.println("Vowel count: " + vowelCount);
//	        System.out.println("Special character count: " + specialCharCount);
//	        System.out.println("Digit count: " + digitCount);
//	        System.out.println("Consonant count: " + consonantCount);
//	    }
//
//	    private static int countVowels(String str) {
//	        return str.replaceAll("[^aeiouAEIOU]", "").length();
//	    }
//
//	    private static int countSpecialCharacters(String str) {
//	        return str.replaceAll("[a-zA-Z0-9]", "").length();
//	    }
//
//	    private static int countDigits(String str) {
//	        return str.replaceAll("[^0-9]", "").length();
//	    }
//
//	    private static int countConsonants(String str) {
//	        return str.replaceAll("[aeiouAEIOU0-9\\W_]", "").length();
		  Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        countCharacters(input);
	        
	    }
	    public static void countCharacters(String input){
	        int vowels = 0, consonants = 0, digits = 0, special = 0;
	        for(int i=0;i<input.length();i++){
	            char ch = input.charAt(i);

	            if((ch >='a' && ch<='z' ) || (ch>='A' && ch<='Z')){
	                ch = Character.toLowerCase(ch);

	                if(ch == 'a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
	                    vowels++;
	                else
	                    consonants++;
	            }
	            else if(ch>='0' && ch<='9')
	                digits++;
	            else
	                special++;
	        }
	        System.out.println("Vowels :  " + vowels);
	        System.out.println("Consonants :  " + consonants);
	        System.out.println("Digits :  " + digits);
	        System.out.println("Special Characters :  " + special);

	}

}
