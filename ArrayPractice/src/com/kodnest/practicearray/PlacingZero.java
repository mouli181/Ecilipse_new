package com.kodnest.practicearray;

import java.util.Scanner;

public class PlacingZero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {

            arr[i] = scanner.nextInt();

        }

        for (int i = 0; i < length; i++) {

            if (arr[i] < 0) {

                arr[i] = 0;

            }

        }

        System.out.print("Modified array:");

        for (int num : arr) {

            System.out.print(" " + num);

        }

	}

}
