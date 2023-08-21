package com.sathya.treemapexample;

import java.util.TreeMap;

public class TreeFruits {

	public static void main(String[] args) {
		TreeMap<String, Integer>fruits1= new TreeMap<String,Integer>();
		fruits1.put("apple", 10);
		fruits1.put("banana", 54);
		fruits1.put("guava", 16);
		
		
		TreeMap<String, Integer>fruits2= new TreeMap<String,Integer>();

	  
	    fruits2.put("kiwi", 28);
		fruits2.put("mango", 20);
		
		TreeMap<String, Integer>fruits3= new TreeMap<String,Integer>();
		fruits3.put("papaya", 13);
		fruits3.put("grapes", 15);
		
		
		TreeMap<String, Integer>fruits= new TreeMap<String,Integer>();
		fruits.putAll(fruits1);
		fruits.putAll(fruits2);
		fruits.putAll(fruits3);
		System.out.println(fruits);
		
	}

}
