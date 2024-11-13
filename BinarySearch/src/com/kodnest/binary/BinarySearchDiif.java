package com.kodnest.binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDiif {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array length");
		int length = s.nextInt();
		int[] a = new int[length];
		
		System.out.println("Enter the array values");
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println("Enter the target element");
		int target = s.nextInt();
		
		// Binary Search //
		
		int left = 0;
		int right = a.length-1;
		int result = -1;
		
		while(left <= right) {
			int mid = left + (right - left) /2;
			if(a[mid] == target) {
				result = mid;
				break;
			}
			else if(a[mid] < target){
				left = mid + 1;
			}
			else {
				right = mid -1;
			}
		}
		if(result != -1) {
			System.out.println("Target element " + target + " found at index " +result + "." );
		}
		else {
			System.out.println("Target element not found in array");
		}
		s.close();

	}

}
