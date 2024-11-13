package com.kodnest.arrays;

import java.util.Scanner;

public class DivTwoThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the size of array");
		int size = s.nextInt();
		int a[] = new int[size];
		
		System.out.println("User enter the array elements are");
		for(int i=0;i<=a.length-1;i++) {
			a[i] = s.nextInt();
		}
		
		System.out.println("The array elements divisible by 2 & 3 are");
		for(int i=0;i<size;i++) {
			if(a[i]%2==0 && a[i]%3==0)
			System.out.println(a[i]);
		}
		

	}

}
