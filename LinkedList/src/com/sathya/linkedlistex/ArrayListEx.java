package com.sathya.linkedlistex;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList nums = new ArrayList();
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		nums.add(500);
		nums.add(600);
//nums.add("String");
//it throws ClasscastException
		// nums.add(null);
//it throws NullPointerException

		Collections.sort(nums);
		System.out.println(nums);
		System.out.println("****************");
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println(nums);
		
		
	}

}
