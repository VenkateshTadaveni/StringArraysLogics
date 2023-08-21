package com.sathya.treemapexample;

import java.util.TreeMap;

public class TreemapEx {

	public static void main(String[] args) {
		TreeMap<String , Double>colors=new TreeMap<String,Double>( new colorComp());
	
		colors.put("blue", 10.0);
		colors.put("green", 23.6);
		colors.put("red", 34.3);
		colors.put("white", 06.0);
		colors.put("violet", 8.8);
		//System.out.println(colors);
	
		System.out.println(colors);
		
		
	
	}

}
