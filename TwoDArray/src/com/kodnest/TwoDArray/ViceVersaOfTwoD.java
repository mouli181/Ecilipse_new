package com.kodnest.TwoDArray;

import java.util.Scanner;

public class ViceVersaOfTwoD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row size");
		int row = s.nextInt();
		System.out.println("Enter the column size");
		int col = s.nextInt();
		
		int[][] m = new int[row][col];
		int[][] n = new int[row][col]; 
		
		System.out.println("Enter the row and column values");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]= s.nextInt();
			}
		}
		System.out.println("The row and column values are");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Copy of m row and column elements are");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				n[i][j] = m[i][j];
				if((i==1) == (j==1)) {
				System.out.print(n[i][j] + " ");
			}}
			System.out.println();
		}
 
	}

}
