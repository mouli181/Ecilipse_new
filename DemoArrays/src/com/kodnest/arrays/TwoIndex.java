package com.kodnest.arrays;

import java.util.Scanner;

public class TwoIndex {
	 public static int[] findTwoSumIndices(int[] stocks, int target) {
	        int[] result = new int[2];
	        int n = stocks.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (stocks[i] + stocks[j] == target) {
	                    result[0] = i;
	                    result[1] = j;
	                    return result;
	                }
	            }
	        }

	        throw new IllegalArgumentException("No two stocks add up to the target amount.");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of stocks:");
	        int n = scanner.nextInt();

	        int[] stocks = new int[n];

	        System.out.println("Enter the stock values:");
	        for (int i = 0; i < n; i++) {
	            stocks[i] = scanner.nextInt();
	        }

	        System.out.println("Enter the target investment amount:");
	        int target = scanner.nextInt();

	        scanner.close();

	        try {
	            int[] result = findTwoSumIndices(stocks, target);
	            System.out.println("Indices of the two stocks that add up to the target amount: " + result[0] + " " + result[1]);
	        } 
	        catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
