package com.kodnest.loopingstaements;

public class OddEven {

	public static void main(String[] args) {
		int odd = 1;
		int even = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				even += i;
			}
			else {
				odd *= i;
			}
			 
		}
		System.out.println("sum of even numbers 1 to 10 is " + even);
		System.out.println("Product of odd numers 1 to 10 is " + odd);
	}

}
