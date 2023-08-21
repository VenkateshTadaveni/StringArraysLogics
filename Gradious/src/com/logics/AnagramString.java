package com.logics;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
//		String s="have you made listen in character in silent you";
//		String[] s1=s.split(" ");
//		System.out.println(Arrays.toString(s1));
//		for(int i=0;i<=s1[i].length();i++) {
//			for(int j=i+1;j<=s1[j].length();j++) {
//				if(s1[i].length()==s1[j].length()) {
//					char ch[]=s1[i].toCharArray();
//					if(ch[i]==ch[j]) {
//						System.out.println(Arrays.toString(ch));
//					}
//				}
//			} 
//				
//			
//			
//		}
//	}

//	char ch='b';
//	ch=(char)(ch+1);
//	int x=ch;
//	System.out.println(x);
//	char ch1=(char)(x);	
//	System.out.println(ch1);
//	
//	char ch2=(char)(ch-32);
//	System.out.println(ch2);
//	
//	char ch3=(char)(ch2+32);
//	System.out.println(ch3);
//	}

String s="Sathya@1$7%8*";
char[] ch=s.toCharArray();
String s1="";
for(int i=0;i<=ch.length-1;i++) {
	if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=122) {
		s1=s1+ch[i];
		
	}
	else
		continue;
}
System.out.println(s1);

		
		
		
}
}
