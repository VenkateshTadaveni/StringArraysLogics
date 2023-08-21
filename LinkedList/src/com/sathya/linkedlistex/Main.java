package com.sathya.linkedlistex;

import java.util.ArrayList;
import java.util.Collections;

class Main
{
	public static void main (String[] args)
	{
		ArrayList<ChromeExample> ar = new ArrayList<ChromeExample>();
		ar.add(new ChromeExample(111, "bbbb", "london"));
		ar.add(new ChromeExample(131, "aaaa", "nyc"));
		ar.add(new ChromeExample(121, "cccc", "jaipur"));

		System.out.println("Unsorted");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyroll());

		System.out.println("\nSorted by rollno");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));
	}
}
