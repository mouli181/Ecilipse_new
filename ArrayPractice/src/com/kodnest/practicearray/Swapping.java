package com.kodnest.practicearray;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of array");
		
        int length = scanner.nextInt();

        int[] arr = new int[length];
        
        System.out.println("Enter the array values");
        for (int i = 0; i < length; i++) {
        	
            arr[i] = scanner.nextInt();

        }
        
        System.out.println("Enter the index value need to be swap");
        int index1 = scanner.nextInt();
        
        System.out.println("Enter the index value need to be swap");
        int index2 = scanner.nextInt();

 

        System.out.print("Array contents before swapping:");

        for (int num : arr) {

            System.out.print(" " + num);

        }

        System.out.println();

        if (index1 >= 0 && index1 < length && index2 >= 0 && index2 < length) 

        {

            int temp = arr[index1];

            arr[index1] = arr[index2];

            arr[index2] = temp;

            System.out.print("Array contents after swapping:");

            for (int num : arr) 

            {

                System.out.print(" " + num);

            }

            System.out.println();

        } 


	}

}
