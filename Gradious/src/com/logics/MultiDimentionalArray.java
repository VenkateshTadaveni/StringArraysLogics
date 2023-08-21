package com.logics;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		Integer[] a1= {1,2,3,2};
		Integer[] a2= {1,2,3};
		Integer[] a3= {1,2,3,4};
		Integer[] a4= {1,2,3};
		Integer[] a5= {1,2,3,1,2};
		int temp[]=new int[a1.length];
		int count=0;
for(int i=0;i<=a1.length-1;i++) {
	for(int j=0;j<=a3.length-1;j++) {
		
		
			
		
		if(a1[i]==a3[j]) {
			count++;
		}
		if(count==a1.length) {
			System.out.println(count);
			System.out.println(a1.length);
			System.out.println("both arrays are equal "+a2+"   "+a3);
		}
		
		
	}
	}
}

		
		}

