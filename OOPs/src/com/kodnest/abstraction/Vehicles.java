package com.kodnest.abstraction;

//abstract class
abstract class Vehicles {
	
	// concrete method
	void engine() {
		System.out.println("Engine");
		
	}
	
	//abstract method
	abstract void gear(); 
	//abstract void fuels();

}

class Bike extends Vehicles{
	
	@Override
	void gear() {
		System.out.println("Bike gear");
	}
}

class Car extends Vehicles{
	
	@Override
	void gear() {
		System.out.println("car gear");
	}
}