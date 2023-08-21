package com.lamdaEx.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionToArray {

	public static void main(String[] args) {
		
		
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(1000);
		numbers.add(400);
		//System.out.println(numbers);
		List<Integer> num= numbers.subList(1, 3);
		System.out.println(num);
		System.out.println("**********************");
	 
		
		
		
		
		
		
		
		

		// conversion of Collections to Arraylist;
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(30);
		number.add(20);
		number.add(40);
		number.add(60);

		Integer[] arraynums = new Integer[number.size()];
		number.toArray(arraynums);
		for (Integer nums : arraynums) {
			System.out.println(nums);
		}
		System.out.println("*************************");
		// Conversation of arrayList to Collection
		String[] array = { "venky", "sai", "kalyan", "santhosh", "pavan" };
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(array));
		names.add("katha veru untadhi");
		names.add("m chesthunnav");
		System.out.println(names);

	}

}
