package com.kodnest.producerconsumer;

public class App {

	public static void main(String[] args) {
		Factory f = new Factory();
		Producer p = new Producer(f);
		Consumer c = new Consumer(f);
		
		Thread t = new Thread(p);
		Thread t1 = new Thread(c);
		
		t.start();
		t1.start();

	}

}
