package com.kodnest.string;

import java.util.Scanner;

public class ConcatenateWithoutPreDefine {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        String firstString = scanner.nextLine();

	        String secondString = scanner.nextLine();

	        String thirdString = scanner.nextLine();

	        String concatenatedString = concatenateStrings(firstString, secondString, thirdString);

	        System.out.println("Concatenated string: " + concatenatedString);

	    }

	    public static String concatenateStrings(String str1, String str2, String str3) {

	        int totalLength = str1.length() + str2.length() + str3.length();

	        char[] result = new char[totalLength];

	        int currentIndex = 0;

	        for (int i = 0; i < str1.length(); i++) {

	            result[currentIndex] = str1.charAt(i);

	            currentIndex++;

	        }

	        for (int i = 0; i < str2.length(); i++) {

	            result[currentIndex] = str2.charAt(i);

	            currentIndex++;

	        }

	        for (int i = 0; i < str3.length(); i++) {

	            result[currentIndex] = str3.charAt(i);

	            currentIndex++;

	        }

	        return new String(result);

	}

}
