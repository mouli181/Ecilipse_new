package com.kodnest.string;

import java.util.Scanner;

public class CompareWithoutEquals {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        String str1 = scanner.nextLine();

	        String str2 = scanner.nextLine();

	        boolean areEqual = compareStrings(str1, str2);

	        if (areEqual) {

	            System.out.println("The strings are equal.");

	        } else {

	            System.out.println("The strings are not equal.");

	        }

	    }

	    public static boolean compareStrings(String str1, String str2) {

	        if (str1.length() != str2.length()) {

	            return false;

	        }

	        for (int i = 0; i < str1.length(); i++) {

	            if (str1.charAt(i) != str2.charAt(i)) {

	                return false;

	            }

	        }

	        return true;

	}

}
