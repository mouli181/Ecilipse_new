package com.kodnest.binary;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array length");
		int length = s.nextInt();
		int[] a = new int[length];
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		int minValue = a[0];
		int maxValue = a[0];
		
		for(int num : a) {
			if(num < minValue) {
				minValue = num;
			}
			if(num > maxValue) {
				maxValue = num;
			}
		}
		System.out.println("The minimum value of an array is " + minValue);
		System.out.println("The maximum value of an array is " + maxValue);

	}

}
