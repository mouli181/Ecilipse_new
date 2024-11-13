package com.kodnest.treeset;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class LargestSmallest {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(20);
		t.add(40);
		t.add(10);
		t.add(50);
		t.add(78);
		
		System.out.println("Smallest is "+t.pollFirst());
		System.out.println("Largest is "+t.pollLast());

	}

}
