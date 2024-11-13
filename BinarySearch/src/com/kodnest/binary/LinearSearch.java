package com.kodnest.binary;

import java.util.Scanner;

public class LinearSearch {

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
		
		// Linear search
		for(int i=0;i<a.length;i++) {
			if(a[i] == target) {
				System.out.println("Found index " + i);
				break;
			}
			else {
				System.out.println("Element not found");
				break;
			}
		}

	}

}
