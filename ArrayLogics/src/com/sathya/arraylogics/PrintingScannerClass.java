package com.sathya.arraylogics;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingScannerClass {

	public static void main(String[] args) {
Scanner santhosh =new Scanner(System.in);
System.out.println("Enter length of array values..");
int n = santhosh.nextInt();
int[] arr=new int[n];
for(int i=0;i<=arr.length-1;i++) {
	arr[i]=santhosh.nextInt();
}
System.out.println(Arrays.toString(arr));
for(int i=0;i<=arr.length-1;i++) {
	int x=1;
	for(int j=2;j<=arr[i]/2;j++) {
		if(arr[i]%j==0) {
			x=0;
			break;
			
		}
	}
	if(x==1) {
		System.out.println("this is prime no--> "+arr[i]);
	}
}

	}
}
