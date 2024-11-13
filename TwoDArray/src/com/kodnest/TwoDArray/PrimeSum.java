package com.kodnest.TwoDArray;

public class PrimeSum {

	public static void main(String[] args) {
		int[][] matrix = {
	            {3, 4, 5, 7},
	            {8, 9, 11, 13},
	            {21, 24, 42,43}
	        };

	        int sum = 0;
	        for (int[] row : matrix) {
	            for (int element : row) {
	                if (isPrime(element)) {
	                    sum += element;
	                }
	            }
	        }

	        System.out.println("Sum of prime numbers in the matrix: " + sum);
	    }

	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;

	}

}
