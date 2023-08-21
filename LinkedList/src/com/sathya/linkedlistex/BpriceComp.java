package com.sathya.linkedlistex;

import java.util.Comparator;


	public class BpriceComp implements Comparator<BooksEx> {

		@Override
		public int compare(BooksEx b1, BooksEx b2) {
			// TODO Auto-generated method stub
			return -b1.bprice.compareTo(b2.bprice);
		}

	}

	