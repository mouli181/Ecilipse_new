package com.kodnest.producerconsumer;

public class Factory {
	int num;

	boolean flag = false;

	synchronized void produce(int num) {
		try{
			if(!flag) {
				this.num = num;
				System.out.println("Produced item : " + num);
				flag = true;
				notify();
			}
			else{
				wait();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	synchronized void consumer(int num) {
		try{
			if(flag) {
		this.num = num;
		System.out.println("Consumd item : " + num);
		flag = false;
				
		notify();
	}
	else{
		wait();
	}
}
catch(Exception e) {
	System.out.println(e);
}
	}

}
