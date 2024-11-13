package com.kodnest.interfaces;

public interface Hierarchy {
	String name = "mouli";
	int age = 22;
}

class hier implements Hierarchy{
	void display() {
		System.out.println(name);
		
	}
}

class archy implements Hierarchy{
	void display1() {
		System.out.println(age);
		
	}
}

class Sol1{
	public static void main(String[] args) {
		hier h = new hier();
		archy a = new archy();
		h.display();
		a.display1();
	}
}
