package com.patterns.create;

import java.util.Arrays;
import java.util.Scanner;

public class FirstPattern {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter the values..");
		int n=scanner.nextInt();
		int []arr=new int[6];
		System.out.println("Enter Array elements...");
		for(int i=0;i<=n;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		int [] arr5= {1,2,3,4,5,6};
		String[] arr1= {"venky","venky1","venky2","venky3"};
		char[] arr2= {'v','e','n','k','y'};
		boolean [] flag= {true,false,true,false,false};
		double[] val= {22.0,33.0,44.3,44.34};
		String s="tadavenivenkatesh";
		
			System.out.println(arr1);
			System.out.println(arr2);
			System.out.println(flag);
			System.out.println(val);
			String s1=s.substring(8,14);
			System.out.println(s1);
		}

	}


