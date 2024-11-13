package com.kodnest.threed;

import java.util.Scanner;

public class BorderElements {

	public static void displayBorderElements(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print(arr[0][i] + " ");
        }

        if (arr.length > 1) {
            for (int i = 1; i < arr.length - 1; i++) {
                System.out.print(arr[i][0] + " ");
                System.out.print(arr[i][arr[i].length - 1] + " ");
            }
        }

        if (arr.length > 1) {
            for (int i = 0; i < arr[arr.length - 1].length; i++) {
                System.out.print(arr[arr.length - 1][i] + " ");
            }
        }

        if (arr.length > 2) {
            for (int i = arr.length - 2; i > 0; i--) {
                System.out.print(arr[i][0] + " ");
                System.out.print(arr[i][arr[i].length - 1] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] array2D = {
                {12, 24, 45, 16, 72},
                {24, 45, 34, 56, 54},
                {12, 23, 34, 45, 43},
                {34, 32, 34, 32, 34},
                {43, 34, 32, 33, 43}
        };

        displayBorderElements(array2D);
    }
}
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the row size");
//		int a = s.nextInt();
//		System.out.println("Enter the column size");
//		int b = s.nextInt();
//		
//		int[][] m = new int[a][b];
//
//		System.out.println("Please enter the row and column values");
//		for(int i=0;i<m.length;i++) {
//			for(int j=0;j<m[i].length;j++) {
//				m[i][j]= s.nextInt();
//			}
//		
//		}
////		System.out.println("The row and column values are");
////		for(int i=0;i<m.length;i++) {
////			for(int j=0;j<m[i].length;j++) {
////				System.out.print(m[i][j] + " ");
////			}
////			System.out.println();
////		
////		}
//		for(int i=0;i<m.length;i++) {
//			for(int j=0;j<m[i].length;j++) {
//				if(i==1 || j==1 || i==5 || j==5) {
//				System.out.print(m[i][j] + " ");
//			}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		
//		}
		