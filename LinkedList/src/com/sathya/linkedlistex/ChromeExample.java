package com.sathya.linkedlistex;
import java.util.ArrayList;


// Java program to demonstrate working of Comparator
// interface and Collections.sort() to sort according
// to user defined criteria.
import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent a student.
@SuppressWarnings("unused")
class ChromeExample
{
	int rollno;
	String name, address;

	// Constructor
	public ChromeExample(int rollno, String name,
							String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString()
	{
		return this.rollno + " " + this.name +
						" " + this.address;
	}
}

class Sortbyroll implements Comparator<ChromeExample>
{
	// Used for sorting in ascending order of
	// roll number
	
		
	

	@Override
	public int compare(ChromeExample o1, ChromeExample o2) {
		// TODO Auto-generated method stub
		 return o1.rollno - o2.rollno;
	}
}

// Driver class
