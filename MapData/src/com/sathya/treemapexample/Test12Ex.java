package com.sathya.treemapexample;

import java.util.ArrayList;
import java.util.List;

public class Test12Ex {
	
	public static List<String> vnames(List<String> names) {
		
		List<String> names1=new ArrayList<String>();
		for(String s:names) {
			if(s.contains("v"))
				names1.add(s);
			}
		return names1;
		}
	

	public static void main(String[] args) {
		List<String>names=new ArrayList<String>();
		names.add("venkatesh");
		names.add("vennela");
		names.add("vaani");
		names.add("veena");
		names.add("nani");
		
		List<String>names1=Test12Ex.vnames(names);
System.out.println(names1);
	}

}
