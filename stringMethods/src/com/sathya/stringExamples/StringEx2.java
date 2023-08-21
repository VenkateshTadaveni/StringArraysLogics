package com.sathya.stringExamples;

public class StringEx2 {

	public static void main(String[] args) {

		String s = "malaya";
		String s1 = "malaya";
		if (s.length() == s1.length()) {

			boolean isequal = false;

			for (int j = 0; j <= s.length() - 1; j++) {

				if (s.charAt(j) != s1.charAt(j)) {
					isequal = true;
					break;
				}
			}
				if (isequal == false) {

					System.out.print("both are equal");
				}

				else {
					System.out.print("both are not equal");
				}
			}
		 else {
			System.out.println("both the lengths are not equal");
		}

	}
}

//		if(s.charAt(s.length()-1)=='a'||s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='i'||s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='u') {
//			System.out.println("this is Vowel--> "+s.charAt(s.length()-1));
//		}
//	 for(int i=0;i<=s.length()-1;i++) {
//		for(int j=s.length()-1;j>=0;j--) {
//			
//			if(s.charAt(i)==s.charAt(j)) {
//				char temp=s.charAt(i);
//			}
//				
//			}
//		 
//			System.out.print(s.charAt(i));
//			
//		}
//	
//	}
//	}
//
//
