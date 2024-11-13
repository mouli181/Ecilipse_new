package com.kodnest.arraylist;

import java.util.ArrayList;

public class Methods {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(0,30);
		
		ArrayList l1 = new ArrayList();
		l1.add(10.5);
		l1.add(20.5);
		l1.add(30.5);
		
		ArrayList l2 = new ArrayList();
		l2.addAll(l);
		l2.addAll(l1);
		
	}

}
