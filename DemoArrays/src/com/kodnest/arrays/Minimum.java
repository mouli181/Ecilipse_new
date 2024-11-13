package com.kodnest.arrays;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the size of an array");
		byte size = s.nextByte();
		byte a[] = new byte[size];
		
		// read the elements of an array
		System.out.println("Enter the byte elements");
		for(byte i=0; i<size;i++) {
			a[i] = s.nextByte();
		}
		
		//display the elements of an array
		System.out.println("The byte array elements are");
		for(byte i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
		// to find the max element of an array
		
		// assuming first element of an array minimum value
		byte min = a[0];
		for(byte i=0;i<=a.length-1;i++) {
			if(min > a[i]) {
				// re assumption of minimum value
				min = a[i];
			}
		}
		System.out.println("The minimum of given array is " + min);

	}

}
