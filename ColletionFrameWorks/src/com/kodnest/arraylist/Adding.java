package com.kodnest.arraylist;

import java.util.ArrayList;

public class Adding {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add('h');
		l.add(56.80);
		l.add(60);
		l.set(1, 66.80);
		
		
		ArrayList l1 = new ArrayList();
		l1.add(4.9);
		l1.add(90);
		l1.add("........");
		
		ArrayList l2 = new ArrayList();
		l2.add(l);
		l2.add(l1);
		
		
		System.out.println(l2);
	}

}
