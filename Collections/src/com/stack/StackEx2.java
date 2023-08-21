package com.stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackEx2 {

	public static void main(String[] args) {
		Stack<String> names=new Stack<String>();
		names.push("hii");
		names.add("hello");
		names.add("good");
		names.add("night");
		//System.out.println(names);
		names.push("venky");
		names.push("venkatesh");
		
		
//		
//		System.out.println(names.pop());
//		
//		System.out.println(names.peek());
//		System.out.println(names.search("good"));
//	
//		System.out.println(names.size());
//		Iterator<String> itr=names.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
		ListIterator<String> litr=names.listIterator(names.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		
		

	}

}
