package com.sathya.linkedlistex;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
LinkedList<String> listEx=new LinkedList<String>();
	listEx.add("Ratan");
	listEx.add("sathya");
	listEx.add("tech");
	System.out.println(listEx);
	listEx.addFirst("first");
	listEx.addLast("last");
	System.out.println(listEx);
	listEx.set(2, "java");
	listEx.set(3, "JDBC");
	System.out.println(listEx);
     System.out.println(listEx.get(1));
     System.out.println(listEx.get(3));
     System.out.println(listEx);
     listEx.remove(2);
     listEx.remove(3);
     System.out.println(listEx);
     System.out.println(listEx.isEmpty());
	listEx.clear();
	System.out.println(listEx.isEmpty());
	
	
	
	}

}
