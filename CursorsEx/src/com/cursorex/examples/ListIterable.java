package com.cursorex.examples;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.print.attribute.Size2DSyntax;

public class ListIterable {

	public static void main(String[] args) {
		ArrayList<Integer> val = new ArrayList<Integer>();
		val.add(100);
		val.add(13);
		val.add(17);
		val.add(123);
		val.add(647);
		val.add(1201);

		System.out.println(val);

		ListIterator<Integer> num = val.listIterator();
		num.add(1000);
		while (num.hasNext()) {
			for (int i = 0; i <= val.size(); i++) {
				boolean isprime = false;
				for (int j = 2; j <= val.size() / 2; j++) {
					if (val.size() % j== 0) {

						isprime = false;
						break;
					}

				}
				if (isprime == true) {
					System.out.println("this is prime number...>" + i);
				} else {
					System.out.println("this is not a prime number");
				}
			}

		}

	}

}
