package com.kodnest.student;

public class Solution {
	public void calculateRecords(String name)
	{
		System.out.println(name + " don't have any records");
	}
	public void calculateRecords(String name, int age)
	{
		System.out.println(name + " have some records and played at thier age of " + age);
	}
	public void calculateRecords(String name, String role)
	{
		System.out.println(name + " is best left hander batsman and " + role + "of Current indian team");
	}
	public void calculateRecords(String name, float innings)
	{
		System.out.println(name + " is best middle order batsman and played " + innings + "innings for india");
	}
	public void calculateRecords(String name, int runs, int centuries)
	{
		System.out.println(name + " is best batsman in the world and he scored "+ runs +"for indian team and scored" + centuries + "centuries for india");
	}
	public void calculateRecords(String name, int runs, float experiance)
	{
		System.out.println(name + " is best Opening batsman in the world and he scored best individual score "+ runs +"and He is current indian team captain of india with "+ experiance + "years of experiance" );
	}
	public void calculateRecords(String name, int runs, int wickets, float innings)
	{
		System.out.println(name + " is best AllRounder and more than" + runs + "runs with "+ wickets+ "wickets for india played minimum " + innings + "innings");
	}
	public void calculateRecords(String name, int matches, int wickets, double average)
	{
		System.out.println(name + " is best Bowler in the world and played less then" + matches + "matches with  "+ wickets+ "wickets for india and the average of " + average);
	}
	
}
