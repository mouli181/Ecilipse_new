package com.kodnest.arrays;

import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//        // Create an initially empty array to store stock values
//        double[] stockArray = new double[100]; // You can adjust the size as needed
//
//        // Variable to keep track of the current index in the array
//        int currentIndex = 0;
//
//        // Prompt the user to enter stock values
//        System.out.println("Enter stock values. Enter a negative number to stop.");
//
//        while (true) {
//            System.out.print("Enter stock value: ");
//            double stockValue = scanner.nextDouble();
//
//            // Check if the user wants to stop entering values
//            if (stockValue < 0) {
//                break;
//            }
//
//            // Add the stock value to the array
//            stockArray[currentIndex] = stockValue;
//
//            // Move to the next index
//            currentIndex++;
//
//            // Check if the array is full, and if so, resize it
//            if (currentIndex == stockArray.length) {
//                stockArray = resizeArray(stockArray);
//            }
//        }
//
//        // Display the entered stock values
//        System.out.println("Entered stock values:");
//        for (int i = 0; i < currentIndex; i++) {
//            System.out.println(stockArray[i]);
//        }
//
//        scanner.close();
//    }
//
//    // Helper method to resize the array when it's full
//    private static double[] resizeArray(double[] oldArray) {
//        int newSize = oldArray.length * 2;
//        double[] newArray = new double[newSize];
//        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
//        return newArray;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the stock length");
		int size = s.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			arr[3] = arr[i];
		}
		
		
		System.out.println("Enter the new stock length");
		int nsize = s.nextInt();
		
		int[] narr = new int[nsize];
		
		for(int i=0;i<narr.length;i++) {
			narr[i] = s.nextInt();
		}
		for(int i=0;i<narr.length;i++) {
			System.out.println(narr[i]);
		}
		int pos=0;
		int arr3=arr.length+narr.length;
		int[] total = new int[arr3];
		for(int i=0;i<total.length;i++) {
		     
		}
		for(int x:total) {
			System.out.println(x);
		}
		
	
	}

}
