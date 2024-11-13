package com.kodnest.arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the row value of an array");
		int row = s.nextInt();
		System.out.println("User please enter the column values of an array");
		int col = s.nextInt();
	
		// create an integer array of size 4
		int[][] a = new int[row][col];
		
		
		// read elements in to the array
		System.out.println("Enter the row and column values");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j] = s.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
