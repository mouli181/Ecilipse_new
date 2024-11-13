package com.kodnest.producerconsumer;

 class Producer implements Runnable {
	
	Factory f;
	public Producer(Factory f) {
		this.f = f;
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			f.produce(i++);
		}
		
	}

}
