package com.kodnest.demothread;

public class Sol {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
			System.out.println(i);
		}
	}
		Task t = new Task();
		t.run();
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

}
}

class Task extends Sol{
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
			System.out.println(i);
		}
		}
//		try {
//			Thread.sleep(0);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
