package com.kodnest.arrays;

import java.util.Scanner;

public class Example2d {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("User enter the row size of an array");
//		int row = s.nextInt();
//		System.out.println("User please enter the column size of an array");
//		int col = s.nextInt();
//	
//		// create an integer array of size 4
//		int[][] a = new int[row][col];
//		
//		
//		// read elements in to the array
//		System.out.println("The row and column values");
//		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				a[i][j] = s.nextInt();
//			}
//		}
//		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//		}
		int[][] a = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < a.length; ++i) {
	      for(int j = 0; j < a[i].length; ++j) {
	        System.out.println(a[i][j]);
	      }
	    }

	}

}
