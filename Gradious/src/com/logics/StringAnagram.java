package com.logics;

public class StringAnagram {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		// boolean isvisited=false;
		int count = 0;
		if (s1.length() == s2.length()) {

			for (int i = 0; i <= ch1.length - 1; i++) {

				for (int j = 0; j <= ch2.length - 1; j++) {

					if (ch1[i] == ch2[j]) {
						// isvisited =true;
						count++;
					}
				}
			}
			if (count == ch1.length) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagram");
			}

		}

		else {
			System.out.println("Both are not same length");
		}

	}

		String s1= "race";
		String s2="care";
		char []ch1= s1.toCharArray();
		char [] ch2=s2.toCharArray();
		if(s1.length()==s2.length()) { 
		  for(int i=0;i<=ch1.length-1;i++) {
			  for(int j=i+1;j<=ch1.length-1;j++) {
				  if(ch1[i]>ch1[j]) {
					  char temp = ch1[i];
					  ch1[i]=ch1[j];
					  ch1[j]=temp;
				  }
				  if(ch2[i]>ch2[j]) {
					  char temp=ch2[i];
					  ch2[i]=ch2[j];
					  ch2[j]=temp;
				  }
				  }
			  }
				  boolean isvenky=true;
				  for(int k=0;k<=ch1.length-1;k++) {
					   if(ch1[k]!=ch2[k]) {
						   isvenky=false;
						   break;
					   }
				  }
					   if(isvenky==true) {
					   System.out.println("anagram ");
				  }
					   else {
						   System.out.println("is not anagram");
					   }
			  }
		else {
			System.out.println("both lengths are not same");
		}
	}
}
		
