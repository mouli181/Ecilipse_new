package com.kodnest.loop;

public class PyramidNumber {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++){
            for(int j=5;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k + " ");
            }
            for(int m=2;m<=i;m++){
                System.out.print(m + " " );
            }
            System.out.println();
        }

	}

}
