package com.kodnest.arrays;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];

        for(int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        System.out.print("Array elements:");
        for(int num : a){
            System.out.print(" " + num );
        }
	}

}
