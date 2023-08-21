package com.sathya.arraylogics;

import java.util.Arrays;

public class RightEvenArraysDemo {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 2, 5, 7, 8 };

		int rightIndex = arr.length - 1;

		for (int i = 0; i <= arr.length - 1; i++) {
			int leftIndex = arr[i];
			if (leftIndex < rightIndex) {
				while (arr[leftIndex] % 2 == 0 && leftIndex < rightIndex) {
					leftIndex++;
					while (arr[rightIndex] % 2 != 0 && leftIndex < rightIndex) {
						rightIndex--;
						if (leftIndex < rightIndex) {
							int temp = arr[leftIndex];
							arr[leftIndex] = temp;
							leftIndex++;
							rightIndex--;
						}
						System.out.println(Arrays.toString(arr));
					}

				}

			}

		}
	}
}
