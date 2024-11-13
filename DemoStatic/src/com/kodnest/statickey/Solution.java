package com.kodnest.statickey;

class Citizen{
//	static int Nationality;
//	int age;
	
//	void display1() {
//		System.out.println("Instance methon");
//	}
//	static void display2() {
//		System.out.println("Static method");
//	}
	{
		System.out.println("Block1");
	}
	static {
		System.out.println("block2");
	}
	
}

public class Solution {

	public static void main(String[] args) {
//		Citizen c = new Citizen();
//		System.out.println(c.Nationality);
//		System.out.println(c.age );
//		c.display1();
//		c.display2();
		
//		Citizen.display2();
		
		System.out.println("main method");
		Citizen c = new Citizen();
		
	}

}
