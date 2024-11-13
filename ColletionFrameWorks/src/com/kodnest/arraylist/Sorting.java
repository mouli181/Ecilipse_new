package com.kodnest.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(70);
		a.add(50);
		a.add(50);
		a.add(40);
		a.add(30);
		
		System.out.println(a);
		
		TreeSet t = new TreeSet(a);
		System.out.println(t);
		
		Collections.sort(a);
		System.out.println(a);

	}

}
