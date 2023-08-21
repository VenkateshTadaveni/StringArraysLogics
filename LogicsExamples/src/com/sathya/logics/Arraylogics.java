package com.sathya.logics;

import java.util.Arrays;

public class Arraylogics {

	public static void main(String[] args) {
int[] arr= {1,3,5,1,1,3,5,8};
boolean [] isvisited=new boolean[arr.length];
for(int i=0;i<=arr.length-1;i++) {
	for(int j=i+1;j<=arr.length-1;j++) {
		if(arr[i]==arr[j]) {
			isvisited[i]=false;
			continue;
		}
		if(isvisited[i]==true) {
			
		System.out.println(Arrays.toString(arr));
			
		}
	}
		
}
System.out.println(Arrays.toString(arr));

	}

}
