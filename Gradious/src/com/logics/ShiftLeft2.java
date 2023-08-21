package com.logics;

import java.util.Arrays;

public class ShiftLeft2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,8,9,0,6,7};
		
		for(int i=0;i<=2;i++) {
			int j,first;
			 first=arr[0];
			for(j=0;j<arr.length-1;j++) { 
				arr[j]=arr[j+1];
		}
				arr[arr.length-1]=first;
		}
			
		System.out.println(Arrays.toString(arr));

	}

}
