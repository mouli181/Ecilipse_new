package com.kodnest.threed;

import java.util.Scanner;

public class CopyOfArray {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the size");
    	int size = s.nextInt(); 
		System.out.println("Enter the row size");
		int row = s.nextInt();
		System.out.println("Enter the column size");
		int col = s.nextInt();
		
		int[][][] m = new int[size][row][col];
		int[][][] n = new int[size][row][col];
		int[][][] p = new int[size][row][col];		
		System.out.println("Enter the row and column values");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				for(int k=0;k<m[i][j].length;k++) {
					m[i][j][k]= s.nextInt();
				}
			}
		}
		System.out.println("The row and column values are");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				for(int k=0;k<m[i][j].length;k++) {
					System.out.print(m[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Copy of m row and column elements are");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				for(int k=0;k<m[i][j].length;k++) {
				n[i][j] = m[i][j];
				System.out.print(n[i][j][k] + " ");
			}
			}
			System.out.println();
		}
		System.out.println();
    }
}
