package com.sathya.arraylogics;

import java.util.Arrays;

public class ShiftEvenOdd {

	public static void main(String[] args) {
   int [] a= {2,5,4,6,7,9,8};
   int left=0,right=0,temp=0;
   for(int i=0;i<=a.length-1;i++) {
	   for(int j=0;j<=a.length-1;j++) {
		   
	
		   if(a[i]%2==0) {
			  
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 left++;
		   }
		   
		   
		   if(a[i]%2!=0) {
			   a[j]=a[i];
		   
			   right--;
		   }
	   }
	   System.out.println(Arrays.toString(a));
	   }
   //System.out.println(left);
		
   }
	}


