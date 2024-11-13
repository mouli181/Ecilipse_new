package com.kodnest.demothread;

public class MainSol  {

	public static void main(String[] args) {
		
		System.out.println("main() starts");
		
		Solution s = new Solution();
		Thread t = new Thread(s);
		t.start();
		try {
			t.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main() stop");

	}


	
	

}
