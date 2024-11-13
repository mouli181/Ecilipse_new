package com.kodnest.demothread;

public class Threading {

	public static void main(String[] args) {

		DaemonThread d = new DaemonThread("Typing");
		DaemonThread e = new DaemonThread("Auto-Correction");
		DaemonThread f = new DaemonThread("Auto-Suggestion");
//		DaemonThread1 e = new DaemonThread1("Auto-Correction");
//		DaemonThread2 f = new DaemonThread2("Auto-Suggestion");
		
		d.start();
		
		e.setDaemon(true);
		f.setDaemon(true);
		
		e.setPriority(1);
		f.setPriority(1);
		
		e.start();
		f.start();

	}

}
