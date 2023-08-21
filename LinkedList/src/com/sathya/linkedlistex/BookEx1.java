package com.sathya.linkedlistex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BookEx1 {

	public static void main(String[] args) {
ArrayList<BooksEx> book=new ArrayList<BooksEx>();
book.add(new BooksEx(123, "Java", 560.00, 400));
book.add(new BooksEx(789, "corejava",600.00, 467));
book.add(new BooksEx(123, "AdvJava", 1000.00, 456));
book.add(new BooksEx(128, "JDBC", 450.00, 320));


//Collections.sort(book,new BooksExC1());
//Collections.sort(book, new BnameComp());
Collections.sort(book,new BpriceComp());

for(BooksEx books:book) {
	System.out.println(books.Bookid+"  "+books.bname+"  "+books.bprice+"  "+books.bpages);
}


	}

}
