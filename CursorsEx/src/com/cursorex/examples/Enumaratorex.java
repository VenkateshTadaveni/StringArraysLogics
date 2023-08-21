package com.cursorex.examples;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enumaratorex {

	public static void main(String[] args) {
Vector<String> items= new  Vector<String>();
items.add("Chicken65");
items.add("KFC");
items.add("Chicken wings");
items.add("Chicken lollypop");


System.out.println(items);
System.out.println("**********Iterator***********");

Iterator<String> itr=items.iterator();
while(itr.hasNext()) {
   String s=itr.next();
	if(s.equals("KFC")) {
		itr.remove();
	}
}
System.out.println(items);
System.out.println("************ListIterator***************");

ListIterator<String> litr= items.listIterator();
while(litr.hasNext()) {
	String s=litr.next();
	if(s.equals("Chicken wings")) {
		litr.remove();
		litr.add("chicken");
	}
	if(s.equals("Chicken lollypop")) {
		litr.set("chiken pakodi");
	}
	
}
System.out.println(items);

System.out.println("*************Enumarator*************");

Enumeration<String> enume=items.elements();
while(enume.hasMoreElements()) {
	 
	String s=enume.nextElement();
	
	
}
System.out.println(items);

}
}

