package com.kodnest.practicearray;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int a[] = new int[size];

        for(int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        
        int smallest = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                smallest = a[i];
                
            }
            

        }
        System.out.println("Smallest number: " + smallest);
        
	}

}
