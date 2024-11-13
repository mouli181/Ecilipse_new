package com.kodnest.primeprograms;

import java.util.Scanner;

public class Power {
	static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            double result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        } else {
            // For negative exponents
            return 1 / calculatePower(base, -exponent);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the power
        double result = calculatePower(base, exponent);

        // Output the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
