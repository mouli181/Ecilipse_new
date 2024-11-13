package com.kodnest.arrays;

import java.util.Scanner;

public class BaseIndex {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input size of the array
	        int n = scanner.nextInt();

	        // Input array elements
	        int[] array = new int[n];
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Find the best index and its corresponding maximum special sum
	        int bestIndex = 0;
	        long maxSpecialSum = Long.MIN_VALUE;

	        for (int i = 0; i < n; i++) {
	            int currentIndex = i;
	            long currentSpecialSum = 0;

	            while (currentIndex < n) {
	                currentSpecialSum += calculateSpecialSum(array, currentIndex);
	                currentIndex += (currentSpecialSum > 0) ? currentSpecialSum : 1;
	            }

	            if (currentSpecialSum > maxSpecialSum) {
	                maxSpecialSum = currentSpecialSum;
	                bestIndex = i;
	            }
	        }

	        System.out.println(maxSpecialSum);

	        scanner.close();
	    }

	    // Function to calculate special sum for a given index
	    private static long calculateSpecialSum(int[] array, int index) {
	        long specialSum = 0;
	        for (int i = index, count = 1; i < array.length && count <= i + 1; i++, count++) {
	            specialSum += array[i];
	        }
	        return specialSum;

}
}
