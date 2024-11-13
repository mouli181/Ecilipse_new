package com.kodnest.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		ArrayDeque l = new ArrayDeque();
		l.add('h');
		l.add(56.80);
		
		l.addFirst("Hii");
		l.addLast("true");
		
		//l.set(1, "66.80");
		
		ArrayDeque l1 = new ArrayDeque();
		l1.addFirst("Welcome");
		l1.add(4.9);
		l1.add(90);
		l.add(90);
		
		l1.add("..");
		l1.addLast("true");
		l1.removeFirst();
		
		ArrayDeque l2 = new ArrayDeque();
		l2.addAll(l);
		l2.addAll(l1);
		//l1.set(1, false);
		System.out.println(l2);
		
		System.out.println(l1.size());
		System.out.println("Using for loop");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l.getFirst());
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
