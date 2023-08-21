package com.sathya.treemapexample;

import java.util.ArrayList;
import java.util.List;

public class ListMainMethodCalling {

	public void addingNumbers(List<Integer> nums) {
		
		int sum=0;
		for(Integer n:nums) {
			
			sum=sum+n;
			System.out.println(nums);
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		ListMainMethodCalling.addingNumbers(nums)=new ListMainMethodCalling();
		
	}

}
