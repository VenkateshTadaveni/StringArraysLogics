package com.sathya.arraylogics;
import java.util.Scanner;
public class StrongNumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("entr a number");
      int n=sc.nextInt();
      
      double result=0;
      int count=0,originalnumber=n;
      
      while(n>0) {
    	  count++;
    	  n=n/10;
    	  
      }
   n=originalnumber;
      
		while(n>0) {
			int rem=n%10;
			result=result+Math.pow(rem, count);
			n=n/10;
		}
		
		if(result==originalnumber) {
			System.out.println("this is armstrong..>"+result+"...."+originalnumber);
		}
	}
	
}


