package com.cursorex.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Vegitables {

	public static void main(String[] args) {
		ArrayList<String> veg = new ArrayList<String>();
		veg.add("dondakaya");
		veg.add("bendakaya");
		veg.add("chikudu");
		veg.add("kakarakaya");

		System.out.println(veg);
		System.out.println("*********************");

		ListIterator<String> vegiter = veg.listIterator();
		vegiter.add("vankaya");
		while (vegiter.hasNext()) {

			String s = vegiter.next();

			if (s.equals("dondakaya")) {
				vegiter.remove();
			}
			if (s.equals("chikudu")) {
				vegiter.set("sora");
			}
		}

		System.out.println(veg);
	}

}
