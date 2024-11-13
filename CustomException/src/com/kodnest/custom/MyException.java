package com.kodnest.custom;

public class MyException extends Exception{
	public MyException() {
		super("Insufficiant funds, try entering a less amount ");
	}
}
