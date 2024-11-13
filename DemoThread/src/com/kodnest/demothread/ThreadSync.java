package com.kodnest.demothread;

class ThreadSync {

	public static void main(String[] args) {
		Hospitel h = new Hospitel();
		
		Thread t = new Thread(h);
		t.setName("Thor");
		Thread t1 = new Thread(h);
		t1.setName("Iron man");
		
		t.start();
		t1.start();
	}

}

class Hospitel implements Runnable {
	
	@Override
	public synchronized void run() {
		
		try {
		String name = Thread.currentThread().getName();
		System.out.println(name +" is in ICU");
		Thread.sleep(2000);
		System.out.println(name + " is getting Treatment");
		Thread.sleep(2000);
		System.out.println(name + " is getting Discharged");
		Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
	
}
