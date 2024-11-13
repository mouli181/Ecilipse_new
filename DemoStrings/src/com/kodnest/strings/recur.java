package com.kodnest.strings;

public class recur {

	public static void main(String[] args) {
		int n = 20;
		//System.out.println("1");
		fact(n);
		//System.out.println("2");

	}
	public static void fact(int n) {
		//System.out.println("3");
		if(n==10) {
			//System.out.println("4");
			return;
		}
		System.out.println("Executing" + n);
		
		n=n-1;
		
		fact(n);
		//System.out.println("6");
		
	}

}
