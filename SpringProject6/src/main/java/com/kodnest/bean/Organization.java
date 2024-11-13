package com.kodnest.bean;

public class Organization {
	String oname;
	String location;
	Trainer trainer;
	public Organization() {
		super();
		System.out.println("0 Para Constr");
	}
	public Organization(String oname, String location, Trainer trainer) {
		super();
		this.oname = oname;
		this.location = location;
		this.trainer = trainer;
		System.out.println("Para Constr");
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		System.out.println("setter for organization");
		this.oname = oname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		System.out.println("setter for location");
		this.location = location;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		System.out.println("setter for trainer");
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Organization [oname=" + oname + ", location=" + location + ", trainer=" + trainer + "]";
	}
	
}
