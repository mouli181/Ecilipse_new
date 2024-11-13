package com.kodnest.linkedlist;

import java.util.LinkedList;

public class Adding {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add('h');
		l.add(56.80);
		l.set(1, "66.80");
		
		LinkedList l1 = new LinkedList();
		l1.add(4.9);
		l1.add(90);
		l1.add(".......");
		
		LinkedList l2 = new LinkedList();
		l2.add(l);
		l2.add(l1);
		l1.set(1, false);
		System.out.println(l2);

	}

}
