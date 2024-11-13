package com.kodnest.inheritance;

class A{
	public A(){
		
		System.out.println("1");
	}
}
class B extends A{
	
	public B() {
		this(10);
		System.out.println("2");
	}
	public B(int a) {
		super();
		System.out.println("3");
		
	}
}
public class SuperAndThis {

	public static void main(String[] args) {
		B b = new B();
		
	}

}
