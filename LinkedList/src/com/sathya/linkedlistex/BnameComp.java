package com.sathya.linkedlistex;

import java.util.Comparator;

public class BnameComp implements Comparator<BooksEx>
{

	@Override
	public int compare(BooksEx b1, BooksEx b2) {
		return b1.bname.compareTo(b2.bname);
	}
	

}
