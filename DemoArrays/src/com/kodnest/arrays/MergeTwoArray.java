package com.kodnest.arrays;

import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the size of an array");
		int a = s.nextInt();
		System.out.println("User enter the size of an 2-nd array");
		int b = s.nextInt();
		
		// create an integer array of size 4
		int m[] = new int[a];
		int n[] = new int[b];
		
		int size = m.length+n.length;
		int c[] = new int[size];
		// read elements in to the array
//		
		
		System.out.println("User please enter elements of 1st array");
		for(int i=0;i<=m.length-1;i++) {
			m[i] = s.nextInt();
			c[i] = m[i];
		}
		
		System.out.println("User please enter elements of 2nd array");
		for(int i=0;i<=n.length-1;i++) {
			n[i] = s.nextInt();
			c[m.length + i] = n[i];
		}
		
		// write elements from the array
		System.out.println("Merging of 2 array is");
		for(int i=0;i<c.length;i++) {
			
			
			System.out.println(c[i]);
		}
		

	}

}
