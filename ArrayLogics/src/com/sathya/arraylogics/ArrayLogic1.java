package com.sathya.arraylogics;

public class ArrayLogic1 {

	public static void main(String[] args) {
		int[]arr= {2,3,4,5,6};
		int cube = 0;
		for(int i=0;i<=arr.length-1;i++) {
			int suare=arr[i]*arr[i];
			
			cube=arr[i]*suare; 
			suare=0;
			System.out.println(cube);
		}
		//System.out.println(cube);
		}
	
}
