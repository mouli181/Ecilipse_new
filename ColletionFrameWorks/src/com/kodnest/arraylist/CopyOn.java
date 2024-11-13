package com.kodnest.arraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOn {

	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(20);
		al.add(30);
		al.add(10);
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			al.add(99);
		}
		System.out.println(al);
	}

}
