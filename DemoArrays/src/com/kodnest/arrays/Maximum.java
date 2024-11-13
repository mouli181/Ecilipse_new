package com.kodnest.arrays;

import java.util.Scanner;

public class Maximum {

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
		System.out.println("The byte array elemts are");
		for(byte i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
		// to find the max element of an array
		byte max = a[0];
		for(byte i=0;i<=a.length-1;i++) {
			if(max < a[i]) {
				// reassumption of max value
				max = a[i];
			}
		}
		System.out.println("The maximum of given array is " + max);

	}

}
