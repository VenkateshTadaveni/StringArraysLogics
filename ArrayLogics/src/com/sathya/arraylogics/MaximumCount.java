package com.sathya.arraylogics;

public class MaximumCount {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 5, 2, 5 };
		int max = 0;
		int maxNum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			int count = 0;
			for (int j = i ; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count > max) {
				max = count;
			maxNum = arr[i];
			}

		}
		System.out.println(maxNum + "...this is maximum elemeent =" + max);

	}

}
