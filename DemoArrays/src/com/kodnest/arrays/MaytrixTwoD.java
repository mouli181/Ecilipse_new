package com.kodnest.arrays;

import java.util.Scanner;

public class MaytrixTwoD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Getting the dimensions of the 2D array from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initializing a 2D array with user-provided dimensions
        int[][] a = new int[rows][columns];

        // Filling the 2D array with user-provided values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for position (" + i + ", " + j + "): ");
                a[i][j] = scanner.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


	}

}
