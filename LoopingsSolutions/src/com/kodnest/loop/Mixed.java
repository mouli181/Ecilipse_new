package com.kodnest.loop;

public class Mixed {

	public static void main(String[] args) {
		 for(int i=1;i<=5;i++){
	            for(int j=1;j<=5;j++){
	                if(i==1 || i==5){
	                System.out.print("?");
	            }
	            else if(j==1 || j==3){
	                System.out.print("*   ");
	            }
	            }
	            System.out.println();
	        }

	}

}