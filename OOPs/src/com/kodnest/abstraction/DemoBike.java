package com.kodnest.abstraction;

public class DemoBike {

	public static void main(String[] args) {
		Bike b = new Bike();
		Car c = new Car();
		b.engine();
		b.gear(); 
		c.engine(); 
		c.gear();
		

	}

}
