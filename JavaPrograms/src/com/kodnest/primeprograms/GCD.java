package com.kodnest.primeprograms;

import java.util.Scanner;

public class GCD {
	static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate the GCD
        int gcd = findGCD(number1, number2);

        // Output the result
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}
