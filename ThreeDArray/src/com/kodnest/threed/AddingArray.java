package com.kodnest.threed;

public class AddingArray {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {5,6,7};
		//int size = a.length + b.length;
		int[] c = new int[6];
		
		
		System.out.println("The array elements are");
		for(int i=0;i<a.length;i++) {
			
				c[i] = a[i];
			}
			
		
		int j=0;
		for(int i=a.length;i<(a.length + b.length);i++) {
			 
				c[i] = b[j++];
			}
		for(int i=0;i<c.length;i++) {
			 
			System.out.println(c[i]+" ");
		}
//		int a[] = { 30, 25, 40 }; 
//        // second array 
//        int b[] = { 45, 50, 55, 60, 65 }; 
//  
//        // determining length of first array 
//        int a1 = a.length; 
//        // determining length of second array 
//        int b1 = b.length; 
//  
//        // resultant array size 
//        int c1 = a1 + b1; 
//  
//        // Creating a new array 
//        int[] c = new int[c1]; 
//  
//        // Loop to store the elements of first 
//        // array into resultant array 
//        for (int i = 0; i < a1; i = i + 1) { 
//            // Storing the elements in  
//            // the resultant array 
//            c[i] = a[i]; 
//        } 
//  
//        // Loop to concat the elements of second  
//        // array into resultant array 
//        for (int i = 0; i < b1; i = i + 1) { 
//  
//            // Storing the elements in the  
//            // resultant array 
//            c[a1 + i] = b[i]; 
//        } 
//  
//        // Loop to print the elements of  
//        // resultant array after merging 
//        for (int i = 0; i < c1; i = i + 1) { 
//              
//            // print the element 
//            System.out.println(c[i]); 
//        } 

	}

}
