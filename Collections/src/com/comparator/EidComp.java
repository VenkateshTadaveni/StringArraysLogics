package com.comparator;

import java.util.Comparator;

public class EidComp implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		
		return -p1.pid.compareTo(p2.pid);
	}

}
