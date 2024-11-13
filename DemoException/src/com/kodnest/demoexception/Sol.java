package com.kodnest.demoexception;

public class Sol {

	public static void main(String[] args) {
//		try {
//			System.out.println(3/0);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("divide by Zero");
//		}
//		try {
//			System.out.println(3/0);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("divide by Zero");
//		}
//		catch(Exception e) {
//			System.out.println("divide by zero");
//		}
//		
//		finally {
//			System.out.println("crucial stms");
//		}
		try {
			try {
				System.out.println(3/0);
			}
			catch(ArithmeticException e) {
				System.out.println("divide by Zer");
			}
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			try {
				System.out.println(3/0);
			}
			catch(ArithmeticException e1) {
				System.out.println("divide by Ze");
			}
			System.out.println("divide by Z");
		}
		
		catch(Exception e) {
			System.out.println("divide by ero");
		}
		
		finally {
			System.out.println("crucial stms");
		}

	}

}
