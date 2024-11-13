package com.kodnest.composition;

public class Page {
	String content;
	
	public Page(String content){
		this.content = content;
	}
	
	void display() {
		System.out.println("Content");
	}
}
