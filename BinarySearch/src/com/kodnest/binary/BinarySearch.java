package com.kodnest.binary;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {13,34,67,89,44,76};
		Arrays.sort(a);
		
		int ele = 67; 
		int low = 0;
		int high = 5; 
		boolean flag = false;
		
		while( low <= high) {
			int mid = (low + high)/2;
			if(a[mid] == ele) {
				System.out.println("Element found");
				break;
			}
			else if(ele > a[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		
		}
		if(flag ==false) {
		System.out.println("Not found");
	}}
	

}
