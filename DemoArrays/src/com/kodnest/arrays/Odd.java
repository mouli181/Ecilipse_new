package com.kodnest.arrays;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the size of an array");
		int size = s.nextInt();
		int a[] = new int[size];
		
		System.out.println("enter the array elements");
		for(int i=0;i<=size-1;i++) {
			a[i] = s.nextInt();
		}
		System.out.println("The array odd elements are");
		for(int i=0;i<=size-1;i++) {
			if(a[i]%2!=0) {
			System.out.println(a[i]);
		}}

	}

}
