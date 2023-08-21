package com.Exception.calling;

import java.util.Iterator;
import java.util.Vector;

public class ExceptionEx1 {

	public static void main(String[] args) {
Vector<String> items=new Vector<String>();
items.add("chicken");
items.add("matan");
items.add("fish");
items.add("france");
items.add("crabs");
items.add("kjf");
Iterator<String>itr=items.iterator();
 
while(itr.hasNext()){
	String s=itr.next();
	if(s.equals("crabs")) {
		itr.remove();
		
	}
}
System.out.println(items);


	}

} 
