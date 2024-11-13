package com.kodnest.arrays;
import java.util.Scanner;
public class EqualArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array1: ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the number of elements in the array2: ");
        int m = s.nextInt();
        int[] b = new int[m];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }
        for (int i = 0; i < m; i++) {
        	if(a[i] == b[i]) {
           System.out.println(a[i]);
        }
        }
        

	}

}
