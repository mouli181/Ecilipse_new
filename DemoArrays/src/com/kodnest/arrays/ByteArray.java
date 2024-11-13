package com.kodnest.arrays;

import java.util.Scanner;

public class ByteArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the byte size");
		byte size = s.nextByte(); 
		byte a[] = new byte[size];
		
		System.out.println("Enter the byte elements");
		for(byte i=0; i<size;i++) {
			a[i] = s.nextByte();
		}
		
		System.out.println("The byte array elemts are");
		for(byte i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
	}

}
