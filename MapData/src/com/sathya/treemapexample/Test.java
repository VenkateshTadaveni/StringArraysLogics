package com.sathya.treemapexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void convertSmallToUpper1(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name.toUpperCase());
		}
	}

	public static void convertSmallToUpper1(List<String> names) {
		for (String name : names) {
			System.out.println(name.toUpperCase());
		}
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("santhosh");
		names.add("saipawan");
		names.add("venky");
		names.add("shiva");
		names.add("kalyan");

		LinkedList<String> linknames = new LinkedList<String>();
		linknames.add("aaa");
		linknames.add("bbb");
		linknames.add("ccc");

		Test.convertSmallToUpper1(names);
		Test.convertSmallToUpper1(linknames);
		
		
		
	}

}
