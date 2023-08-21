package com.sathya.arraylogics;

public class EqualsArraydemo {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 6 };
		boolean flag = false;

		if (arr1.length == arr2.length) {

			for (int i = 0; i <= arr1.length - 1; i++) {
				if (arr1[i] == arr2[i]) {

					flag = true;

				}
				if (arr1[i] != arr2[i]) {
					flag = false;
				}
			}
			if (flag == true) {
				System.out.println("two arryas are equal,...");
			} else {
				System.out.println("two arrays are not equal");
			}
		} else {
			System.out.println("two arrays are not sameeee....>");
		}
	}
}


