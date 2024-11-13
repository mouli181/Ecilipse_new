package com.kodnest.threed;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Enter the size of an array");
//		int n = s.nextInt();
//		
//		int[] a = new int[n];
//		System.out.println("Enter the values");
//		for(int i=0;i<a.length;i++) {
//			a[i] = s.nextInt();
//		}
//
//		System.out.println("The array values are");
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
//		System.out.println("Enter the how many position the array need to be rotate");
//		int k = s.nextInt();
//		
//		
//		System.out.println("The rotation of " + k + "position of array is ");
//		for(int i=0;i<a.length;i++) {
//			int b = (k+n)%n;
//			System.out.println(a[i]);
//		}
//
//	}
//
//}
		 Scanner scanner = new Scanner(System.in);

	        // Input array
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        // Input rotation count
	        System.out.print("Enter the number of rotations: ");
	        int d = scanner.nextInt();

	        // Rotate the array
	        int[] rotatedArray = rotateArray(arr, d);

	        // Output the rotated array
	        System.out.println("Rotated array:");
	        for (int num : rotatedArray) {
	            System.out.print(num + " ");
	        }
	    }

	
	    // Function to rotate the array
	    private static int[] rotateArray(int[] arr, int d) {
	        int n = arr.length;
	        int[] rotatedArr = new int[n];
	        for (int i = 0; i < n; i++) {
	            rotatedArr[(i + d) % n] = arr[i];
	        }
	        return rotatedArr;
	    }
	}
  