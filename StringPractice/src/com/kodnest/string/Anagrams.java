package com.kodnest.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();

        String str2 = scanner.nextLine();

        boolean areAnagrams = areAnagrams(str1, str2);

        if (areAnagrams) {

            System.out.println("The two strings are anagrams.");

        } else {

            System.out.println("The two strings are not anagrams.");

        }

    }

    public static boolean areAnagrams(String str1, String str2) {

        // Remove spaces and convert to lowercase

        str1 = str1.replaceAll("\\s", "").toLowerCase();

        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of both strings are equal

        if (str1.length() != str2.length()) {

            return false;

        }

        // Sort both strings and compare

        char[] charArray1 = str1.toCharArray();

        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);

        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

	}

}
