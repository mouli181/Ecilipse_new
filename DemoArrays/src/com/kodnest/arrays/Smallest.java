package com.kodnest.arrays;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int length = scanner.nextInt();

	        int[] arr = new int[length];

	        for (int i = 0; i < length; i++) {

	            arr[i] = scanner.nextInt();

	        }

	        int smallest = arr[0];

	        for (int i = 1; i < length; i++) {

	            if (arr[i] < smallest) {

	                smallest = arr[i];

	            }

	        }

	        System.out.println("Smallest number: " + smallest);
	}

}
