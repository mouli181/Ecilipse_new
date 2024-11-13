package com.kodnest.search;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int[] a,int target) {
		for(int i=0;i<a.length;i++) {
			if(a[i] == target) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = s.nextInt();
		
		int[] a = new int[size];
		System.out.println("enter the array values");
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Enter the target element");
		int target = s.nextInt();
		System.out.println(linearSearch(a,target));
	}

}
