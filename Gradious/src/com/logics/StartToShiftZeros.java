package com.logics;

import java.util.Arrays;

public class StartToShiftZeros {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 0, 4, 0, 2, 2, 4, 5, 0, 5, 0 };
		int i = 0, j = 0, temp;

		// if u want similarly RightToShiftZeros
		// make only == to != in if condition if(arr[i]!=0){};
		// it changes the LeftShiftZeros to RightSHiftZeros Program Code

		// LeftToShiftZeros
		while(i<arr.length) {
			if(arr[i]!=0) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
			}
			else {
				i++;
				
			}
		}
		System.out.println(Arrays.toString(arr));

		// 2nd method sir will says
//		int count = 0, k;
//		for (k = 0; k <= arr.length - 1; k++) {
//			if (arr[k] != 0) {
//				arr[count] = arr[k];
//				count++;
//			}
//		}
//		while (count < arr.length) {
//			arr[count] = 0;
//			count++;
//		}
//		System.out.println(Arrays.toString(arr));
		
		int count=0;
		int last=arr.length-1;
		for(int s=0;s<=arr.length-1;s++) {
			if(arr[s]==0) {
				arr[count]=arr[s];
				count++;
				
			}
			if(arr[s]!=0)
			{
				arr[last]=arr[s];
				last--;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
}
