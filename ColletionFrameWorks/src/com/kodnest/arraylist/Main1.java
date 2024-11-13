package com.kodnest.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(20);
		l.add(null);
		l.add("mouli");
		
		ArrayList l1 = new ArrayList();
		l1.add(40.5);
		l1.add(10.5);
		l1.add(30.5);
		l1.sort(null);
		
		ArrayList l2 = new ArrayList();
		l2.add(l);
		l2.add(l1);
		System.out.println(l2);
		
		System.out.println(l1.size());
		System.out.println("Using for loop");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("Using for each");
		for(Object object:l) {
			System.out.println(object);
		}
		//Iterator i = l.iterator();
		System.out.println("Using Iterator");
		Iterator iterator = l.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
