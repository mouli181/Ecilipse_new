package com.kodnest.hackerrank;

import java.util.Scanner;

public class Weired {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		if(a %2 != 0) {
			System.out.println("Weired");
		}
		else if(a >=2 && a<=5) {
			if(a%2==0) {
				System.out.println("Not Weired");
			}
		}
		else if(a >=6 && a<=20) {
			if(a%2==0) {
				System.out.println("this num is iclusive range of 6 to 20 even number");
				System.out.println("Weired");
			}
		}
		else {
			System.out.println("It is greater then 20");
			System.out.println("Not Weired");
		}
	}

}
