package com.kodnest.student;

public class Application {

	public static void main(String[] args) {
		Solution s = new Solution();
		s.calculateRecords("Tilak varma");
		s.calculateRecords("Subman Gill",21);
		s.calculateRecords("Rishabn Pant", "Wicket Keeper");
		s.calculateRecords("Lokesh Rahul", 220.5f);
		s.calculateRecords("Virat Kholi", 18034,71);
		s.calculateRecords("Rohit sharma", 264,15.5f);
		s.calculateRecords("Ravindera Jadeja", 3000,200,112.5f);
		s.calculateRecords("Jasprit Bumrah",80,250,12.5);
	}

}
