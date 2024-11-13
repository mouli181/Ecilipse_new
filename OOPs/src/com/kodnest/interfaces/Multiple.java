package com.kodnest.interfaces;

interface Multiple {
	String str = "Mouli";
}

interface multiple1{
	String s = "tharan";
}

class MultipleChild implements Multiple,multiple1{
	void display() {
		System.out.println(str);
		System.out.println(s);
	}
}

class Application{
	public static void main(String[] args) {
		MultipleChild m = new MultipleChild();
		m.display();
	}
}