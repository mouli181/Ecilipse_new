package com.kodnest.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		PriorityQueue l1 = new PriorityQueue();
		l1.add(40);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		//l1.add("Mouli");
		//l1.add(null);
		System.out.println(l1);
		
		System.out.println(l1.size());
		//System.out.println("Using for loop");
//		for(int i=0;i<l1.size();i++) {
//			System.out.println(l1.get());
//		}
		System.out.println("Using for each");
		for(Object object:l1) {
			System.out.println(object);
		}
		//Iterator i = l.iterator();
		System.out.println("Using Iterator");
		Iterator iterator = l1.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
