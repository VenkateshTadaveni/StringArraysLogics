package com.sathya.treemapexample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneNumberMapEx {

	public static void addingNumbers(Set<Integer> numbers) {

		int sum = 0;
		for (Integer num : numbers) {
			sum += num;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(10);
		numbers.add(27);
		numbers.add(34);
		numbers.add(56);
		numbers.add(90);
		PhoneNumberMapEx.addingNumbers(numbers);
	}

}
