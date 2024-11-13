package com.kodnest.bean;

public class Laptop {
	String name;
	String color;
	public Laptop() {
		super();
		System.out.println("O-param constr");
	}
	public Laptop(String name, String color) {
		super();
		this.name = name;
		this.color = color;
		System.out.println("param constr");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Setter-name");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		System.out.println("Setter-color");
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", color=" + color + "]";
	}
	
}
