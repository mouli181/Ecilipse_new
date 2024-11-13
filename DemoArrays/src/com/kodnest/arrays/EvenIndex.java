package com.kodnest.arrays;

import java.util.Scanner;

public class EvenIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the size of array");
		int size = s.nextInt();
		int a[] = new int[size];
		
		System.out.println("User enter the array elements are");
		for(int i=0;i<=a.length-1;i++) {
			a[i] = s.nextInt();
		}
		
		System.out.println("The array Even index elements are");
		for(int i=0;i<size;i++) {
			if(i%2==0)
			System.out.println(a[i]);
		}
		

	}

}
