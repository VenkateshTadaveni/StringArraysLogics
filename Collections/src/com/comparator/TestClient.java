package com.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.arraylist.Arraylist;

public class TestClient {

	public static void main(String[] args) {
		ArrayList<Person> person=new ArrayList<Person>();
  person.add(new Person(123, "venky", "Venky@gmail.com"));
  person.add(new Person(124, "banki", "Venky@gmail.com"));
  person.add(new Person(125, "kanki", "Venky@gmail.com"));
  person.add(new Person(122, "chunki", "Venky@gmail.com"));
  person.add(new Person(121, "lunky", "Venky@gmail.com"));
  //Descending order by Id's
  
  Collections.sort(person,new EidComp());
  for( Person p:person) {
	  System.out.println(p.pid+" "+p.pname+" "+p.email);
  }
  //ascending order by names
  System.out.println("***************************");
  Collections.sort(person,new EnameComp());
  for(Person p:person) {
	  System.out.println(p.pid+" "+p.pname+"    "+p.email);
  }
  
	}

}
