package com.sathya.arraylogics;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
	int [] arr= {1,3,5,2,5};
	int [] arr1= {6,8,4,6,0};
	Arrays.sort(arr);
	Arrays.sort(arr1);
  int [] a= {arr.length+arr1.length};
  int count=0;
  for(int i=0;i<=arr.length-1;i++) {
	  a[count]=arr[i];
	  count++;
	  for(int j=0;j<=arr1.length-1;j++) {
		  a[count]=arr1[j];
		 count++;
		  
	  }
	  while(count<=a.length-1) {
		  a[count]=arr[i];
		  
	  }
  }
  System.out.println(Arrays.toString(a));
}
}
