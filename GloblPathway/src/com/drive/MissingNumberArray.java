package com.drive;

import java.util.Arrays;

public class MissingNumberArray {

	public static void main(String[] args) {
		int[] arr = { 20, 30, 10, 8, 40, 35,7,11,13,14};
		for (int i = 0; i <= arr.length - 1; i++) {
			boolean isprime = true;

			for (int j = 2; j <= arr[i]/2; j++) {

				if (arr[i] % j == 0) {
					isprime = false;
					break;
				}
			}
			
				if (isprime == true) {
					System.out.println(arr[i] + "  this is is prime no");
				} else {
					System.out.println("not prime " + arr[i]);
				}
			}
		}
	}

