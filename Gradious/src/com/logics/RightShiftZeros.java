package com.logics;

import java.util.Arrays;

public class RightShiftZeros {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 3, 0, 4 };
		int j = 0;
		int temp, i = 0;

		while (j < arr.length) {
			// for( j=0;j<=arr.length-1;j++) {
			if (arr[j] != 0) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
				i++;

			} else
				j++;

		}
		System.out.println(Arrays.toString(arr));
	}
}
