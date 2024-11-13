package com.kodnest.search;

import java.util.Scanner;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		
		int[] a = new int[size];
		System.out.println("Enter the array values");
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		a = bubbleSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
