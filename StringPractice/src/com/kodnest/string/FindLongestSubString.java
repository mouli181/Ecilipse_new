package com.kodnest.string;

import java.util.Scanner;

public class FindLongestSubString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        

        // Find and display the longest word in the input string

        String longestWord = findLongestWord(input);

        System.out.println("Longest Word: " + longestWord);

    }

    // Function to find the longest word in a string

    public static String findLongestWord(String input) {

        // Split the input string into words based on spaces and punctuation marks

        String[] words = input.split("[\\s\\p{Punct}]+");

        // Initialize variables to keep track of the longest word and its length

        String longestWord = "";

        int maxLength = 0;

        // Iterate through the words and find the longest one

        for (String word : words) {

            if (word.length() > maxLength) {

                maxLength = word.length();

                longestWord = word;

            }

        }

        return longestWord;

	}

}
