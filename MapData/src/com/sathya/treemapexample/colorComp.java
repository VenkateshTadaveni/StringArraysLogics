package com.sathya.treemapexample;

import java.util.Comparator;

public class colorComp implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
				return -s1.compareTo(s2);
	}

}
