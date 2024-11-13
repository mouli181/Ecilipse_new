package com.kodnest.aggregation;

class Pilot{
	String name;
	
	public Pilot(String name){
		this.name = name;
	}
	
	void fly() {
		System.out.println(name + " is flying the palne");
	}


}

class Airlines{
	
	String airname;
	Pilot pilot;
	
	public Airlines(String airname, Pilot pilot) {
		this.airname = airname;
		this.pilot= pilot;
	}
	
	void operate() {
		 System.out.println(airname + " operating....");
		 pilot.fly();
	}
	
}

public class AggregationDemo {
	

	public static void main(String[] args) {
		Pilot p = new Pilot("Mouli");
		Airlines a = new Airlines("KisgFhisher",p);
		
		// a.operate();
		a = null;
		//a.operate();
		p.fly();
		

	}

}

