package com.kodnest.arrays;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! enter the array size");
		int size = s.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i] = s.nextInt();
		}
		
		System.out.println("The elements of array are");
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("The reverse elements of given array is");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}

	}

}
