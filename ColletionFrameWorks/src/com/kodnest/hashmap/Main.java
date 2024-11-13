package com.kodnest.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> h = new LinkedHashMap<Integer, String>();
		h.put(1, "Java");
		h.put(5, "Html");
		h.put(2, "Css");
		h.put(2, "Python");
		h.put(4, "Sql");
		System.out.println(h);
		
	}

}
