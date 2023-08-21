package com.sathya.examples;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Consumer<T> {
	 void accept(T t);
}



public class ForEachEx1 {

	public static void main(String[] args) {
List<Integer> num=new ArrayList<Integer>();		
num.add(10);
num.add(30);
num.add(130);
num.add(14);
num.add(18);
		
	System.out.println(num);
	num.forEach((n)-> System.out.println(n));
	}

}
