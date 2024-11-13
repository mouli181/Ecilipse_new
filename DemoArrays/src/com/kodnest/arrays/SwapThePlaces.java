package com.kodnest.arrays;

import java.util.Scanner;

public class SwapThePlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int length = scanner.nextInt();

	        int[] arr = new int[length];

	        for (int i = 0; i < length; i++) {

	            arr[i] = scanner.nextInt();

	        }

	        int index1 = scanner.nextInt();

	        int index2 = scanner.nextInt();

	 

	        System.out.print("Array contents before swapping:");

	        for (int num : arr) {

	            System.out.print(" " + num);

	        }

	        System.out.println();

	        if (index1 >= 0 && index1 < length && index2 >= 0 && index2 < length) 

	        {

	            int temp = arr[index1];

	            arr[index1] = arr[index2];

	            arr[index2] = temp;

	            System.out.print("Array contents after swapping:");

	            for (int num : arr) 

	            {

	                System.out.print(" " + num);

	            }

	            System.out.println();

	        } 

	}

}
