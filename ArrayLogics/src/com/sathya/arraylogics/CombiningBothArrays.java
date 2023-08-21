package com.sathya.arraylogics;

import java.util.Arrays;

public class CombiningBothArrays {

	public static void main(String[] args) {
int[] a= {1,2,3,4,5};
int [] b= {6,7,8,9,0};
int[] c=new int[a.length+b.length];

int count=0;
for(int i=0;i<=a.length-1;i++) {
	c[count++]=a[i];
	
}
	for(int j=0;j<=b.length-1;j++) {
		c[count++]=b[j];
		
	}
	System.out.println(Arrays.toString(c));
		
	}
}


