package com.kodnest.hackerrank;

import java.util.Scanner;

public class MealPrice {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double meal = s.nextInt();
		int tip = s.nextInt();
		int tax = s.nextInt();
		
		mealCost(meal,tip,tax);
		
		
	}
	public static void mealCost(double meal, int tip, int tax) {
		
		double tipTotal = 1;
		
		double taxTotal = 2;
		
		int mealTotal = (int) (meal + taxTotal + tipTotal);
		
		System.out.println(mealTotal);
	}
}
