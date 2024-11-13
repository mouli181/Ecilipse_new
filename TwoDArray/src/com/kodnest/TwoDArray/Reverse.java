package com.kodnest.TwoDArray;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row size");
		int a = s.nextInt();
		System.out.println("Enter the column size");
		int b = s.nextInt();
		
		int[][] m = new int[a][b];

		System.out.println("Please enter the row and column values");
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

		System.out.println("The reverse elements of given array is");
		for(int i=m.length-1;i>=0;i--) {
			for(int j=m[i].length-1;j>=0;j--) {
			System.out.println(m[i][j]);
		}}

	}

}
