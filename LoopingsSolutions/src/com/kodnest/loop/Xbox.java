package com.kodnest.loop;

public class Xbox {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                if(i==1 || j==1 || j==10 || i==10 || i==5 || j==5 || i==j || i+j==10){
                System.out.print("*");
                }
                else {
                	System.out.print(" ");
                }
            }
            System.out.println();
        }

	}

}
