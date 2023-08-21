package com.sathya.logics;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a year..-> ");
		int year = s.nextInt();
		if (year % 100 == 0) {
			System.out.println("this is century year");
		}

		if (year % 400 == 0) {
			System.out.println("this is leap Year");
		}

		else if (year % 4 == 0) {
			System.out.println("this is a leap year by 4");
		}

		else {
			System.out.println("this is not leap year");

		}

	}
}
