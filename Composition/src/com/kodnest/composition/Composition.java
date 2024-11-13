package com.kodnest.composition;

public class Composition {

	public static void main(String[] args) {
		Book b = new Book("reading.....");
		b.readPage();
		b=null;
		 b.readPage();

	}

}
