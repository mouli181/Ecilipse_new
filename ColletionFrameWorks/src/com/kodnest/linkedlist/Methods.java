package com.kodnest.linkedlist;

import java.util.LinkedList;

public class Methods {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.set(0,30);
		System.out.println(l);
		
		LinkedList l1 = new LinkedList();
		l1.add(10.5);
		l1.add(20.5);
		l1.add(30.5);
		
		LinkedList l2 = new LinkedList();
		l2.addAll(l);
		l2.addAll(l1);
		System.out.println(l2);

	}

}
