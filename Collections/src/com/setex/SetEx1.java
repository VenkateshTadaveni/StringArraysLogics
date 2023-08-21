package com.setex;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {

	public static void main(String[] args) {
		Set<String> names=new TreeSet<String>();
		names.add("venky");
		names.add("value1");
		names.add("value2");
		names.add("value3");
		names.add("value1");
		names.add("value2");
		System.out.println(names);
		
		
	}

}
