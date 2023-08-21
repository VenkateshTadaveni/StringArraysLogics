package com.sathya.arraylistex;

import java.util.ArrayList;

public class VowelEx {

	public static void main(String[] args) {
		ArrayList<Character> vowel=new ArrayList<Character>();
		
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		//System.out.println(vowel);
		ArrayList<Character> vowel1=new ArrayList<Character>(vowel);
		
		vowel1.add('o');
		vowel1.add('u');
		
		
	System.out.println(vowel1);
	

	ArrayList<String> student=new ArrayList<String>();
	
 student.add("Venkatesh");
 student.add("Kalyan");
 student.add("Santhosh");
 student.add("Shiva");
 
 student.add("Sai pavan");
 
 System.out.println(student);
 System.out.println("               ");
 
 ArrayList<String> teachers=new ArrayList<String>();
 teachers.add("Mr.Ratan");
 teachers.add("Naresh");
 teachers.add("Dinesh");
 teachers.add("Kannababu");
 teachers.add("Samba");
 
System.out.println(teachers);
System.out.println("                           ");
 
ArrayList<String> course=new ArrayList<String>();

course.add("Full stack Java");
course.add("Full stack .Net");
course.add("Full stack python");
course.add("Airtificail Intelligence");
course.add("Full stack UI");

System.out.println(course);
System.out.println("                      ");

ArrayList<String> name=new ArrayList<String>();

name.add(" Mr.RATAN ");
System.out.println(name);
System.out.println("********************");




ArrayList<String> institute=new ArrayList<String>();

institute.addAll(student);
institute.addAll(teachers);
institute.addAll(course);
institute.add("Mr.Ratan");

System.out.println(institute);



	} 
	

}
