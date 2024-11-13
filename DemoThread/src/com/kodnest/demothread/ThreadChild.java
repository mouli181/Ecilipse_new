package com.kodnest.demothread;

public class ThreadChild implements Runnable{
	public void run() {
		for(int i='a';i<='m';i++) {
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((char)i);
		}
	}
}
