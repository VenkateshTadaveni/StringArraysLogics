package com.sathya.stringlogics;

import java.util.Arrays;

public class StringEx1 {

	public static void main(String[] args) {
String s="Harika nuvu love";

String[]  s1=s.split(" ");
for(int i=0;i<=s1.length-1;i++) {

	 String s2=s1[i];
	 for(int j=s2.length()-1;j>=0;j--) {
		 System.out.print(s2.charAt(j));
		 
	 }
	 System.out.print(" ");
}

System.out.println(" ");

for(int i=s1.length-1;i>=0;i--) {

	 String s2=s1[i];
	 for(int j=s2.length()-1;j>=0;j--) {
		 System.out.print(s2.charAt(j));
		 
	 }
	 System.out.print(" ");
}




}
}

