package com.logics;

import java.util.Arrays;

public class ShiftRight {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 1, 2, 3 };
		for(int i=0;i<=2;i++) {
			int j;
			int last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
				
			}
			arr[0]=last;
		}
		System.out.println(Arrays.toString(arr));
		

//		for (int i = 0; i <= 2; i++) {
//			int j, last = arr[arr.length - 1];
//		
//		for (j=arr.length-1;j>0;j--) {
//			
//			arr[j]=arr[j-1];
//		}
//		arr[0]=last;
//
//		}
//		System.out.println(Arrays.toString(arr));

	}

}
