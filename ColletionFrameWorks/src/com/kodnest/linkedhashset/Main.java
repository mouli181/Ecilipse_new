package com.kodnest.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		LinkedHashSet t = new LinkedHashSet();
		t.add(20);
		t.add(40);
		t.add(10);
		t.add(50);
		t.add(78);
		t.add(50);
		t.add("Mouli");
		t.add(null);
		System.out.println(t);
		
		System.out.println(t);
		System.out.println(t.size());
//		System.out.println("Using for loop");
//		for(int i=0;i<t.size();i++) {
//			System.out.println(t.get(i));
//		}
		System.out.println("Using for each");
		for(Object object:t) {
			System.out.println(object);
		}
		//Iterator i = l.iterator();
		System.out.println("Using Iterator");
		Iterator iterator = t.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}


	}

}
