package com.kodnest.diff;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        int n = 6;

	        for (int i = 1; i <= n; i++) {

	            // Print spaces

	            for (int j = 1; j < i; j++)

	                System.out.print(" ");

	            // Print numbers in increasing order

	            for (int j = i; j <= n; j++)

	                System.out.print(j + " ");

	            System.out.println();

	        }

	}

}
