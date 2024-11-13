package com.kodnest.primeprograms;

import java.util.Scanner;

public class Nplusone {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = s.nextInt();
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i ;
		}
		System.out.println(sum);
	}

}
