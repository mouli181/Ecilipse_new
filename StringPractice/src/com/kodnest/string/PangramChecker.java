package com.kodnest.string;

import java.util.Scanner;

public class PangramChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        boolean isPangram = isPangram(inputString);

        if (isPangram) {

            System.out.println("The given string is a pangram.");

        } else {

            System.out.println("The given string is not a pangram.");

        }

    }

    public static boolean isPangram(String inputString) {

        inputString = inputString.toLowerCase();

 

        boolean[] alphabet = new boolean[26]; // To track the presence of each alphabet letter

 

        for (int i = 0; i < inputString.length(); i++) {

            char c = inputString.charAt(i);

            if (c >= 'a' && c <= 'z') {

                alphabet[c - 'a'] = true; // Mark the corresponding alphabet as present

            }

        }

        // Check if all alphabet letters are present

        for (boolean present : alphabet) {

            if (!present) {

                return false; // If any letter is missing, it's not a pangram

            }

        }

 

        return true; // All letters are present, it's a pangram

	}

}
