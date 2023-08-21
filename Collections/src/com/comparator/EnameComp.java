package com.comparator;

import java.util.Comparator;

public class EnameComp implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.pname.compareTo(o2.pname);
	}

}

