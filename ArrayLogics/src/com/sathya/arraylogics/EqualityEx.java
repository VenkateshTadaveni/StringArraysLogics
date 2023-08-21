package com.sathya.arraylogics;

public class EqualityEx {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] a1 = { 6, 5, 4, 3, 2, 7 };
		if (a.length == a1.length) {
			int count = 0;
			for (int i = 0; i <= a.length - 1; i++) {
				for (int j = 0; j <= a.length - 1; j++) {
					if (a[i] == a1[j]) {
						count++;
						break;
					}
				}
			}
			if (count == a.length)
				System.out.println("Both arrays are equal");
			else
				System.out.println("both are not equal");
		} else
			System.out.println("both are not equal");
	}
}
