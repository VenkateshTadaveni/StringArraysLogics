package com.sathya.logics;

import java.util.Arrays;

public class ArrayBobbleSort {

	public static void main(String[] args) {
 int [] arr= {3,4,2,1,8};
 int temp=0;
 for(int i=0;i<=arr.length-1;i++) {
	 
	 for(int j=i;j<=arr.length-1;j++) {
	 if(arr[i]>arr[j]) {
		 temp=arr[i];
	 arr[i]=arr[j];
	 arr[j]=temp;
	 
	 }
 
	}
 //System.out.println(Arrays.toString(arr));

}
 System.out.println(Arrays.toString(arr));
}
}
