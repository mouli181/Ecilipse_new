package com.kodnest.TwoDArray;

public class MatricPrimeSum {

	public static void main(String[] args) {
		int[][] a = {{3,4,5,7},
				{8,9,11,13},
				{21,22,24,43}};
		System.out.println("Prime numbers in the matrix are: ");
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (isPrime(a[i][j])) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
		System.out.println();
		int sum = 0;
        for (int[] row : a) {
            for (int element : row) {
                if (isPrime(element)) {
                    sum += element;
                }
            }
        }

        System.out.println("Sum of prime numbers in the matrix: " + sum); 
		
	}
	public static boolean isPrime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a % i == 0) {
				return false;
			}
			
			
		}
		return true;
	}
	}

