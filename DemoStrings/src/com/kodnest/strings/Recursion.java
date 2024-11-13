package com.kodnest.strings;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		fact(5);
	}
	public static void fact(int n) {
		if(n==0) {
			return;
		}
		System.out.println("executing" + n);
		n--;
		fact(n);
	}

}
