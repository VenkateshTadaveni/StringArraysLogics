package com.patterns.create;

public class Petterns2 {

	public static void main(String[] args) {
	for(int i=0;i<=5;i++) {
		for(int j=i;j<5;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	System.out.println("**********Pattern1***********");
	 for(int i=0;i<=5;i++) {
		 for(int j=5;j>=i;j--) {
			 System.out.print("*");
			 
		 }
		 System.out.println();
	 }
	 System.out.println("___________Pattern3___________");
	 
	 for(int i=0;i<5;i++) {
		 for(int j=0;j<=i;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 System.out.println("___________Pattern4___________");
	 
	 for(int i=0;i<=5;i++) {
		 for(int j=0;j<=i;j++) {
		System.out.print(" ");	 
	
		 for(int k=5;k>=i;k++) {
			 System.out.print("*");
		 }
		 }
		 System.out.println();
	 }
	
	
	
	
	}

}
