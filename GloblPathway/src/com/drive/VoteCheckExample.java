package com.drive;

import java.util.Scanner;

public class VoteCheckExample {

	static void check() throws InvalidAgeException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Dob..");
		String dob = scanner.next();
		System.out.println("Enter the Year of Birth...?");
		int year = scanner.nextInt();
		int cur_age = 2023;
		cur_age = cur_age - year;

		if (cur_age >= 18) {
			System.out.println("Elegible for Vote..");
			System.out.println("Ur DateOfBirth.. " + dob);

		} else {
			throw new InvalidAgeException("You are Not eligiblefor Vote...");
		}

	}

	public static void main(String[] args) throws InvalidAgeException {
		VoteCheckExample.check();
	}
}