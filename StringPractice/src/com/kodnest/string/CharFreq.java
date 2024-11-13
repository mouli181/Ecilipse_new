package com.kodnest.string;

import java.util.Scanner;

public class CharFreq {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        String input = scanner.nextLine();

	 

	        // Count character frequencies

	        countCharacterFrequencies(input);

	    }

	 

	    // Function to count character frequencies

	    public static void countCharacterFrequencies(String str) {

	        int[] frequency = new int[256]; // Assuming ASCII characters

	 

	        for (int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);

	            frequency[ch]++;

	        }

	 

	        // Print character frequencies

	        for (int i = 0; i < 256; i++) {

	            if (frequency[i] > 0) {

	                char ch = (char) i;

	                System.out.println("Character: " + ch + " Frequency: " + frequency[i]);

	            }

	        }

	}

}
