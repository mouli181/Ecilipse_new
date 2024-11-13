package com.kodnest.arrays;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean isPresent = false;
		System.out.println("User enter the size of an array");
		byte size = s.nextByte();
		byte a[] = new byte[size];
		
		// read the elements of an array
		System.out.println("Enter the elements");
		for(byte i=0; i<size;i++) {
			a[i] = s.nextByte();
		}
		
		//display the elements of an array
		System.out.println("The byte array elements are");
		for(byte i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter the element");
		byte b = s.nextByte();
		for(int i=0;i<a.length;i++) {
			if(b == a[i]) {
				isPresent = true;
				break;
			}
		}
		if(isPresent == true) {
			System.out.println("Present");
		}
		else {
			System.out.println("Not present");
		}
		
		

	}

}
