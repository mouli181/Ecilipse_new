package com.kodnest.string;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        String input = scanner.nextLine();

	 

	        // Replace spaces with "99"

	        String modifiedString = replaceSpacesWith99(input);

	 

	        // Print the modified string

	        System.out.println(modifiedString);

	    }

	 

	    // Function to replace spaces with "99"

	    public static String replaceSpacesWith99(String str) {

	        StringBuilder modified = new StringBuilder();

	 

	        for (int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);

	            if (ch == ' ') {

	                modified.append("99");

	            } else {

	                modified.append(ch);

	            }

	        }

	 

	        return modified.toString();

	}

}
