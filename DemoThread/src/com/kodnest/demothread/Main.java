package com.kodnest.demothread;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		PrintAlpha a = new PrintAlpha();
		PrintNum n = new PrintNum();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(n);
		
		t1.start();
		t2.start();

	}
 
}
