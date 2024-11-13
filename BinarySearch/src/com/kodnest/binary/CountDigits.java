package com.kodnest.binary;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int count = countDigits(number);
   
        System.out.println("Number of digits: " + count);
        
        scanner.close();
    }
    
   
    public static int countDigits(long number) {
        number = Math.abs(number);
        
        if (number == 0) {
            return 1;
        }
        
        int count = 0;
        
        while (number != 0) {
            number /= 10;
            count++;
        }
        
        return count;
	}

}
