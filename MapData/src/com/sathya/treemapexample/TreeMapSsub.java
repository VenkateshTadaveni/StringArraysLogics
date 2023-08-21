package com.sathya.treemapexample;

import java.lang.Character.Subset;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapSsub {

	public static void main(String[] args) {
		TreeMap<String, Integer>names=new TreeMap<String,Integer>();
		names.put("venky", 10);
		names.put("kalyan", 23);
		names.put("santhosh", 12);
		names.put("saipawan", 15);
		names.put("shiva", 13);
		
		SortedMap<String, Integer>name1=names.subMap("kalyan", "shiva");
		System.out.println(name1);
		SortedMap<String, Integer> names2=names.tailMap("kalyan");
		System.out.println(names2);
		SortedMap<String, Integer>names3=names.headMap("santhosh");
		System.out.println(names3);
		TreeMap<String, Integer>name=new TreeMap<String,Integer>(name1);
		
		//TreeMap<String, Integer>name=new TreeMap<String,Integer>(name);
		//TreeMap<String, Integer>name=new TreeMap<String,Integer>(name1);

	}

}
