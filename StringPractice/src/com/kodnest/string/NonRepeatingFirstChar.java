package com.kodnest.string;

import java.util.Scanner;

public class NonRepeatingFirstChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        char firstNonRepeatingChar = findFirstNonRepeatingChar(inputString);

        if (firstNonRepeatingChar != '\0') {

            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);

        } else {

            System.out.println("No non-repeating character found in the given string.");

        }

    }

    public static char findFirstNonRepeatingChar(String inputString) {

        int[] charCount = new int[256]; // Assuming ASCII characters

 

        // Count the occurrences of each character

        for (int i = 0; i < inputString.length(); i++) {

            char c = inputString.charAt(i);

            charCount[c]++;

        }

 

        // Find the first character with count 1 (non-repeating)

        for (int i = 0; i < inputString.length(); i++) {

            char c = inputString.charAt(i);

            if (charCount[c] == 1) {

                return c;

            }

        }

 

        return '\0'; // If no non-repeating character is found

	}

}
