package com.kodnest.string;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        String input = scanner.nextLine();

	 

	        // Check if the input string is a palindrome

	        boolean isPalindrome = checkPalindrome(input);

	 

	        // Print the result

	        if (isPalindrome) {

	            System.out.println("The input string is a palindrome.");

	        } else {

	            System.out.println("The input string is not a palindrome.");

	        }

	    }

	 

	    // Function to check if a string is a palindrome

	    public static boolean checkPalindrome(String str) {

	        int left = 0;

	        int right = str.length() - 1;

	 

	        while (left < right) {

	            if (str.charAt(left) != str.charAt(right)) {

	                return false;

	            }

	            left++;

	            right--;

	        }

	 

	        return true;

	}

}
