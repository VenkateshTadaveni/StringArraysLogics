package com.sathya.logics;

public class PalindromeNumDemo {

	public static void main(String[] args) {
int n=11;
int rem,rev=0,sum=0;
int originalNumber=n;
while(n>0) {
	rem=n%10;
	rev=rev*10+rem;
	sum+=rev;
	n=n/10;
	
	
}
if(rev==originalNumber) {
	System.out.println("this is palindrome number");
	
}
else {
	System.out.println("this is not a palindrome number");
}
	}

}
