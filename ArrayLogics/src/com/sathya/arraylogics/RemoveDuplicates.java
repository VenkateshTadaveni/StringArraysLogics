package com.sathya.arraylogics;

import java.util.Arrays;



public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a= {2,5,7,3,2,4,3,4};
		int temp=0;
		for(int i=0;i<=a.length-1;i++) {
			boolean visited=true;
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]!=a[j]) {
					visited=false;
					temp=a[j];
				//continue;
				}
			}
				if(visited==true) {
					System.out.println(temp);
				}
			}
		}
}

