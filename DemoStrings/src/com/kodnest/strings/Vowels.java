package com.kodnest.strings;

public class Vowels {

	public static void main(String[] args) {
		String s = "write2proGrams4.H.W!";

        int vowelsCount = 0;
        int specialCharsCount = 0;
        int charsCount = 0;
        int consonantsCount = 0;

        // Convert the string to lowercase for case-insensitive counting
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
            // Check if the character is a consonant
            else if ((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                consonantsCount++;
            }
            // Check if the character is a special character
            else if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                specialCharsCount++;
            }
            // Count all characters (including digits)
            charsCount++;
        }

        // Display the results
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
        System.out.println("Special Characters: " + specialCharsCount);
        System.out.println("Total Characters: " + charsCount);
	}

}
