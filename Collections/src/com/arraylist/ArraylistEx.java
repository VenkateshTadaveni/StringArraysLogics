package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistEx {

	public static void main(String[] args) {
		ArrayList<String> nums=new ArrayList<String>();
//		nums.add(100);
//		nums.add(200);
//		nums.add(300);
//		nums.add(400);
//		nums.add(500);
		nums.add("venky");
		nums.add("sai");
		nums.add("pawan");
		nums.add("pranav");
		
		
		String n=nums.get(3);
		System.out.println(n);
		
		
		
		ListIterator<String> itr=nums.listIterator();
		
		while(itr.hasNext()) {
			String s1=String.valueOf(itr.next());
		
			
			if(s1.equals("venky")) {
				itr.set("Venkatesh");
			}
		}
			System.out.println(nums);
			
		}
	
	}

