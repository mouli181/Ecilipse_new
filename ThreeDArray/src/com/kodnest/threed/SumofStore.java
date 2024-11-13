package com.kodnest.threed;

public class SumofStore {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {5,6,7};
		//int size = a.length + b.length;
		int[] c = new int[3];
		
		
		System.out.println("The sum of  elements are");
		for(int i=0;i<a.length;i++) {
			
				c[i] = a[i]+b[i];
				System.out.println(c[i]+" ");
			}
			
		
			
	}

}
