package com.kodnest.interfaces;

public interface StudentActivities {
	 
	void sleep();
	
	void study();
	
	void play();
	
	void practice();
}

class MechStudent implements StudentActivities{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Simply sleeping");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Simply studying");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Simply playing");
	}

	@Override
	public void practice() {
		// TODO Auto-generated method stub
		System.out.println("make practice");
	}
	
}

class CsStudent implements StudentActivities{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("cs student Simply studying");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("cs student Simply sleeping");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("cs student Simply playing");
	}

	@Override
	public void practice() {
		// TODO Auto-generated method stub
		System.out.println("cs student Simply practicing");
	}
	
}

