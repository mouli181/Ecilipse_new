package com.kodnest.abstraction;

public interface Shape {
	abstract void draw();

	}

class Circle implements Shape {

	    public void draw() {

	        System.out.println("Drawing Circle");

	    }

	}

