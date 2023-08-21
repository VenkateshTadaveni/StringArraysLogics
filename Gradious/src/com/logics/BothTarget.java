package com.logics;

public class BothTarget {

	public static void main(String[] args) {
		int[] a= {8,4,9,3,0,2,5};
		int target=14,sum=0;
		for(int i=0;i<=a.length-1;i++) {
			
			
			for(int j=i;j<=a.length-1;j++) {
				if(a[i]+a[j]==target) {
					System.out.println("sum of these elements "+a[i]+"  "+a[j]+ " and target is "+target);
				}
				
			}
		}

	}

}
