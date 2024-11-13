package com.kodnest.primeprograms;

import java.util.Scanner;

public class Prime {
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean result = isPrime(number);

        // Output the result
        System.out.println("Is the number prime? " + result);
    }
}
