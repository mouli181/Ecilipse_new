package com.kodnest.arraylist;

import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Legacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.add(10);
		s.add(30);
		s.add(20);
		s.add(20);
		System.out.println(s);
		
		Vector v = new Vector();
		v.add(10);
		v.add(30);
		v.add(20);
		v.add(10);
		System.out.println(v);
		
		Hashtable h = new Hashtable();	
		h.put(1,10);
		h.put(1,10);
		h.put(2,20);
		h.put(2,20);
		System.out.println(h);
		
		Properties p = new Properties();
		p.put(1,10);
		p.put(2,20);
		p.put(2,20);
		System.out.println(p);
		
	}

}
