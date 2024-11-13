package com.kodnest.string;

import java.util.Scanner;

public class RemoveDuplicte {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        String input = scanner.nextLine();

	 

	        // Remove duplicate characters from the input string

	        String result = removeDuplicates(input);

	 

	        // Print the resulting string

	        System.out.println(result);

	    }

	 

	    // Function to remove duplicate characters from a string

	    public static String removeDuplicates(String str) {

	        StringBuilder result = new StringBuilder();

	        boolean[] seen = new boolean[256]; // Assuming ASCII characters

	 

	        for (int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);

	            if (!seen[ch]) {

	                result.append(ch);

	                seen[ch] = true;

	            }

	        }

	 

	        return result.toString();
	}
}
