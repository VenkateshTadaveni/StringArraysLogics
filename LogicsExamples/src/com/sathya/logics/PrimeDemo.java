package com.sathya.logics;

import java.util.Scanner;

public class PrimeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			boolean isprime = true;

			for (int j = 2; j <= n / 2; j++) {
				if (i% j == 0) {
					isprime = false;
					break;

				}
			}
			if (isprime == true) {
				System.out.println("this is prime"+i);
			} else {
				System.out.println("this is not a prime");
			}
		}
	}

}
