package com.kodnest.interfaces;

public class Demo {

	public static void main(String[] args) {
		StudentActivities s ; 
		s = new MechStudent();
		s.practice();
		s.play();
		s.study();
		s.sleep();
		//MechStudent m = new MechStudent();
		s = new CsStudent();
		s.study();
		s.sleep();
		s.practice();
		s.play();
		
	}

}
