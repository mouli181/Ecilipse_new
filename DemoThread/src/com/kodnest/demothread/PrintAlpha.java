package com.kodnest.demothread;

class PrintAlpha implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	for(char i ='a'; i <='l';i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
}
