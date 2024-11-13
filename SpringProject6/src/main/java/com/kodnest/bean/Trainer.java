package com.kodnest.bean;

public class Trainer {
	int id;
	String name;
	public Trainer() {
		super();
		System.out.println("0 Para Sonstr");
		// TODO Auto-generated constructor stub
	}
	public Trainer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Para Constr");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("This is setter for trainer");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		System.out.println("Setter for Trainer name");
		this.name = name;
	}
	
	
}
