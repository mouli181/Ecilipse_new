package com.kodnest.search;

import java.util.Arrays;

public class BinarySearch {
	
	public static int search(int[] a,int key) {
		int l = 0;
		int h=a.length-1;
		int mid = 0;
		
		while(l <= h) {
			mid = (l+h)/2;
			
			if(key == a[mid]) {
				return mid;
			}
			else if(key < a[mid]) {
				h = mid - 1;
			}
			else{
				l = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = {1,6,7,3,5,2,4,9,8,10};
		Arrays.sort(a);
		int key = 8;
		System.out.println("The position of array is "+search(a,key));

	}

}
