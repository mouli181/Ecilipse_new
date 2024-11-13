package com.kodnest.demothread;

public class DaemonThread extends Thread{
	
	public DaemonThread(String name) {
		super(name);
	}
	
	public void typing() {
		for(int i=0;i<=10;i++) {
			
			System.out.println("Typing...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void autoCorrection() {
		for(; ;) {
			System.out.println("Auto-Correction");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void autoSuggestion() {
		for(; ;) {
			System.out.println("Auto-Suggestion");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void run() {
		if(this.getName().equalsIgnoreCase("typing")) {
			typing();
		}
		else if(this.getName().equalsIgnoreCase("Auto-Correction")) {
			autoCorrection();
		}
		else if(this.getName().equalsIgnoreCase("Auto-Suggestion")) {
			autoSuggestion();
		}
	}
}


	
