package com.kodnest.linkedlist;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(60);
		l.add(40);
		l.add(20);
		l.sort(null);
		
		LinkedList l1 = new LinkedList();
		l1.add(60.5);
		l1.add(20.5);
		l1.add(30.5);
		//l1.sort(null);
		
		LinkedList l2 = new LinkedList();
		l2.addAll(l);
		l2.addAll(l1);
	
		System.out.println(l2);
	}

}
