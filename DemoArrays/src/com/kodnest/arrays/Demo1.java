package com.kodnest.arrays;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the size of an array");
		int size = s.nextInt();
		// create an integer array of size 4
		int a[] = new int[size];
		System.out.println(a.length + "is size of an array");
		// read elements in to the array
//		
		
		System.out.println("User please enter " + size +" integer elements of array");
		for(int i=0;i<=a.length-1;i++) {
			a[i] = s.nextInt();
		}
		
		// write elements from the array
		
		System.out.println("The" + size + " elements of array are");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}

	}

}
