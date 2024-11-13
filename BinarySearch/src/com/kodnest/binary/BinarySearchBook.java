package com.kodnest.binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array length");
		int length = s.nextInt();
		int[] a = new int[length];
		
		System.out.println("Enter the array values");
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		System.out.println("Enter the target element");
		int target = s.nextInt();
		
		// Binary Search
		
		Arrays.sort(a);
		int index = Arrays.binarySearch(a,target);
		
		if(index >= 0) {
			System.out.println("Element at index " + index);
		}

	}

}
