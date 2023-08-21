package com.numbersLogics;

public class PrimeNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 9, 4, 5, 8, 7 };
		for (int i = 0; i <= arr.length - 1; i++) {
			boolean isprime = true;
			// char ch='a';
			for (int j = 2; j <= arr[i] / 2; j++) {
				if (arr[i] % j == 0) {
					isprime = false;
					// ch='b';
					break;
				}
			}
			if (isprime == true) {
				System.out.println("this is prime no " + arr[i]);
			} else {
				System.out.println("this is not a prime " + arr[i]);
			}
		}

	}

}
