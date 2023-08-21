package com.sathya.arraylogics;

public class StringLtoUpper {

	public static void main(String[] args) {
String s="SatTHya@56";
char[] ch=s.toCharArray();
for(int i=0;i<=ch.length-1;i++) {
	if(ch[i]>='a'&& ch[i]<='z') {
				
	ch[i]=(char) (ch[i]-32);
//	ch[i]=(char)(x);
	}
	else  {
		ch[i]=ch[i];
	}
	  System.out.print(ch[i]);
	}
	
}
	}


  