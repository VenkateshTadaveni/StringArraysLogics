package com.sathya.arraylogics.arraylogics.bin;

public class SecondSmallest {
	static void secondSmall(int[] arr) {
		int firstMin=arr[0],secondMin=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<firstMin) {
				secondMin=firstMin;
				firstMin=arr[i];
			}
			else if(arr[i]<secondMin&&arr[i]!=firstMin) {
				secondMin=arr[i];
				
		}
		}
		System.out.println(firstMin);
		System.out.println(secondMin);
	}

	public static void main(String[] args) {
		int[] arr= {9,8,2,4,10,5,3,11,2};
		SecondSmallest.secondSmall(arr);

	}

}
