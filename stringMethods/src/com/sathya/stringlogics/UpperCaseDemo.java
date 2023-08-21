package com.sathya.stringlogics;

public class UpperCaseDemo {

	public static void main(String[] args) {
String s="SathYa @25 YeaRS";
char[] ch=s.toCharArray();
for(int i=0;i<=ch.length-1;i++) {
	if(ch[i]>='A'&&ch[i]<='Z') {
		System.out.println(ch[i]);
	}
}
	}
}


