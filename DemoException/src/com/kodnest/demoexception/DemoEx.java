package com.kodnest.demoexception;

class DemoEx {

//	public static void main(String[] args) {
//		System.out.println("main-start");
//		metod1();
//		System.out.println("main-stop");
//
//	}
//
//	static void metod1() {
//		System.out.println("method start-1");
//		method2();
//		System.out.println("method-1 stop");
//	}
//
//	static void method2() {
//		System.out.println("method start-2");
//		method3();
//		System.out.println("method-2 stop");
//	}
//
//	static void method3() {
//		System.out.println("method start-3");
//		try {
//		System.out.println(10/0);
//		}
//		catch(Exception e) {
//			System.out.println("avoid using 0 for denominator");
//		}
//		System.out.println("method-3 stop");
//		
//	}
	public static void main(String[] args) {
		System.out.println("main-start");
		metod1();
		System.out.println("main-stop");

	}

	static void metod1() {
		System.out.println("method start-1");
		method2();
		System.out.println("method-1 stop");
	}

	static void method2() {
		System.out.println("method start-2");
		try {
		method3();
		}
		catch(Exception e) {
			System.out.println("avoid using 0 for denominator");
		}
		
		System.out.println("method-2 stop");
	}

	static void method3() {
		System.out.println("method start-3");
		
		System.out.println(10/0);
		
		
		System.out.println("method-3 stop");
		
	}

}
