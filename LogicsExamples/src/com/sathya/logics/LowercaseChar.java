package com.sathya.logics;

public class LowercaseChar {

	public static void main(String[] args) {

	char[] arr= {'a','x','k','u','#','%','2','p','6','9'};
	if(arr[0]>='A'&&arr[0]<='Z'||arr[0]>='a'&&arr[0]<='z') {
		System.out.println("this is  a lowercase&Uppercase char--> "+arr[0]);
	}
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>='a'&&arr[i]<='z') {
			System.out.println("this is a lowercase char");
		}
		if(arr[i]>=65&&arr[i]<=122) {
			System.out.println("alphabets==> "+arr[i]);
		}
	
		if(arr[0]=='a'||arr[0]=='e'||arr[0]=='i'||arr[0]=='o'||arr[0]=='u') {
			System.out.println("this is firstAlhabet is Vowel or Not--> "+arr[0]);
		}
	}
}
}
