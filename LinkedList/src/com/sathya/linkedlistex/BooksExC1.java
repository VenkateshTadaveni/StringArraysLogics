package com.sathya.linkedlistex;

import java.util.Comparator;

public class BooksExC1 implements Comparator<BooksEx>
{

	@Override
	public int compare(BooksEx b1, BooksEx b2)
	{
		
		return b1.Bookid-b2.Bookid;
	}
	}
