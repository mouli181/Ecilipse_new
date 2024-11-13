package com.kodnest.primeprograms;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n + " "+ "*" + " "+ i + " " +"= " + (n*i));
		}
	}

}
