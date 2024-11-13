package com.kodnest.producerconsumer;

class Consumer implements Runnable {
	
	Factory f;
	public Consumer(Factory f) {
		this.f = f;
	}

	@Override
	public void run() {
		int i = 0;
		while(true) {
			f.consumer(i++);
		}
	}

}
