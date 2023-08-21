package com.sathya.arraylogics;

import java.util.Arrays;

public class ShiftZeroToLastEx {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 4, 0, 3, 5, 0, 6, 7, 8 };
		int temp = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] != 0) {
				arr[temp] = arr[i];
				temp++;
			}
		}
		while (temp <= arr.length - 1) {
			temp = 0;
			temp++;
		}

		System.out.println(Arrays.toString(arr));

	}
}
