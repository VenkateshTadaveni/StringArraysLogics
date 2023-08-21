package com.sathya.treemapexample;

import java.util.ArrayList;
import java.util.List;

public class TestEx {
	
	public static List<String> rnames(List<String> names)
	{
		List<String>rnames=new ArrayList<String>(names);
		for(String name:rnames) {
		//name.startsWith("r");
		if(name.contains("r")){ 
			rnames.add(name);
			//System.out.println(name);
			
		}
		}
		return rnames;
		
	}
	
	
	

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
names.add("roja");
names.add("rani");
names.add("ratan");
names.add("pavi");
names.add("ramba");
List<String>rnames=TestEx.rnames(names);
System.out.println(rnames);

	}

}
