package com.kodnest.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array length");
		int size = s.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt(); 
		}
		
		System.out.println("Enter the index to know element");
		int idx = s.nextInt();
		System.out.println("element: " + arr[idx]);
		}
		catch(InputMismatchException i) {
			System.out.println("User please enter the valid integer");
			
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Enter with the array limit");
		}
		catch(NegativeArraySizeException n) {
			System.out.println("Please enter the positive value");
		}
		catch(Exception e) {
			//System.out.println("Exception caught");
			e.printStackTrace();
		}
		finally {
			System.out.println("End");
		}
	}

}
