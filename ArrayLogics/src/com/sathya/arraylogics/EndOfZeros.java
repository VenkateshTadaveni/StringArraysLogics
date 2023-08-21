package com.sathya.arraylogics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EndOfZeros {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 3, 0, 4, 0 };
		int temp = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

			System.out.println(Arrays.toString(arr));
		}

	}

