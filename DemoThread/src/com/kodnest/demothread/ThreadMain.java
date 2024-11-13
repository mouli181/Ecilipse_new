package com.kodnest.demothread;

class ThreadMain {

	public static void main(String[] args) {
		Child t = new Child();
		
		//Thread t1 = new Thread(t);
		
		t.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("Parent class");
			//Thread.currentThread();
			Thread.yield();
		}
	}

}

class Child extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child class");
		}
	}
}
