package com.kodnest.arrays;

import java.util.Scanner;

public class BubbleSortAscending {
	 public static void main(String []args) {
//		    int num, i, j, temp;
//		    Scanner input = new Scanner(System.in);
//		 
//		    System.out.println("Enter the number of integers to sort:");
//		    num = input.nextInt();
//		 
//		    int array[] = new int[num];
//		 
//		    System.out.println("Enter " + num + " integers: ");
//		 
//		    for (i = 0; i < num; i++) 
//		      array[i] = input.nextInt();
//		 
//		    for (i = 0; i < ( num - 1 ); i++) {
//		      for (j = 0; j < num - i - 1; j++) {
//		        if (array[j] > array[j+1]) 
//		        {
//		           temp = array[j];
//		           array[j] = array[j+1];
//		           array[j+1] = temp;
//		        }
//		      }
//		    }
//		 
//		    System.out.println("Sorted list of integers:");
//		 
//		    for (i = 0; i < num; i++) 
//		      System.out.println(array[i]);
//		  }
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
	        bubbleSortascending(array);

	        // Display the sorted array
	        System.out.println("Sorted array in ascending order:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }

	    // Method to perform bubble sort in descending order
	    public static void bubbleSortascending(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                // Swap if the element found is less than the next element
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
}
