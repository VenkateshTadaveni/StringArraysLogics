package com.sathya.arraylogics;

import java.util.Arrays;

public class IndexDiffeSmallestLargest {

	public static void main(String[] args) {
		int[] arr = { 2, 8, 17, 2, 4, 9, 1, 2 };

		int max = 0;
		int count = 0, index = 0,num = 0;
		int nummax = arr[0];
		for (int i = 1; i <= arr.length - 1; i++) {

			if (arr[i] > max) {
				max = arr[i];
				count++;
			}
		
			else if (arr[i] < nummax) {
				nummax = arr[i];
				
			index++;
			}
	
			// System.out.println(i);

		}
		num=count+index;
		System.out.println(max + "...largest element index..." + count);
		// System.out.println(max);
		System.out.println(nummax + "... smallest element index..." +num);

	}
}
