package com.sathya.logics;

import java.util.Arrays;

public class SortingEx {

	public static void main(String[] args) {
		int[] a = {9,8,7,6,5};
		int temp=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				//a[a.length-1]=a[i];
				//a[i]=a[a.length-1];
				
				
			}
		}
		System.out.println(Arrays.toString(a));
	}
}