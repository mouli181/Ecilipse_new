package com.kodnest.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Display {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println("Using for loop");
		for(int i =0;i<l.size();i++) {
			System.out.print(l.get(i)+ " ");
		}
		System.out.println();
		
		
		System.out.println("Using While");
		int i = 0;
		while(i<l.size()) {
			System.out.println(l.get(i)+ " ");
			i++;
		}
		
		System.out.println("Do-While");
		int j = 0;
		do {
			System.out.println(l.get(j)+" ");
			j++;
		}while(j<l.size());
		
		System.out.println("Uisng for-each"); 
		for(Object b : l) {
			System.out.println(b);
		}
		
		System.out.println("Using Iterator");
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+ " ");
		}
		System.out.println("Using for-rach");
		for(Object o:l) {
			System.out.println(o);
		}
		
	}

}
