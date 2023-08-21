package com.sathya.mapexmple;

import java.util.Comparator;

public class Namecomp implements Comparator<UserTreeSetEx> {

	@Override
	public int compare(UserTreeSetEx o1, UserTreeSetEx o2) {
		// TODO Auto-generated method stub
		return o1.uname .compareTo(o2.uname);
	}

}
