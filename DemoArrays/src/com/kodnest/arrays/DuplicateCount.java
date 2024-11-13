package com.kodnest.arrays;

import java.util.Scanner;

public class DuplicateCount {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 7};

        // Remove duplicates and count occurrences
        int n = array.length;

        // Flag array to mark if an element is visited
        boolean[] visited = new boolean[n];

        System.out.println("Unique Elements and their Counts:");
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;

                // Check for duplicates and count occurrences
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        visited[j] = true;
                        count++;
                    }
                }

                // Print the unique element and its count
                System.out.println(array[i] + " - Count: " + count);
            }
        }

        // Print the array with unique elements
        System.out.println("\nArray with Unique Elements:");
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.print(array[i] + " ");
            }
        }
	}
}
