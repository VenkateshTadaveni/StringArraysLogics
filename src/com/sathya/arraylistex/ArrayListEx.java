package com.sathya.arraylistex;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Book> books= new ArrayList<Book>();
		books.add( new Book(123,"java","JAMES GOSLING"));
		books.add( new Book(321,"java1","JAMES"));
		books.add( new Book(432,"java2"," GOSLING"));
		books.add( new Book(676,"java3","JAMES GOSLING"));
		books.add( new Book(789,"java4","JAMES GOSLING"));
		
		Book b=books.get(3);
		System.out.println(b.bookid+" "+b.bname+" "+b.bauthor+" ");
		
		
		for(Book book:books) {
			System.out.println(book.bookid+" "+book.bname+" "+book.bauthor+" ");
		}
		
	}

}
