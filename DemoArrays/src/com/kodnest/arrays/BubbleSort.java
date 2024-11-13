package com.kodnest.arrays;

import java.util.Scanner;

public class BubbleSort {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the size of the array from the user
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Create an array to store user input
	        int[] array = new int[size];

	        // Get elements of the array from the user
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

	        // Call the method to perform bubble sort in descending order
	        bubbleSortDescending(array);

	        // Display the sorted array
	        System.out.println("Sorted array in descending order:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }

	    // Method to perform bubble sort in descending order
	    public static void bubbleSortDescending(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                // Swap if the element found is less than the next element
	                if (arr[j] < arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

}
