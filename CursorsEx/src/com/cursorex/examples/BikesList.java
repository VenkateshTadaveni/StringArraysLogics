package com.cursorex.examples;

import java.util.Vector;

public class BikesList {

	public static void main(String[] args) {

		Vector<Bikes> bike = new Vector<Bikes>();
		bike.add(new Bikes("Pulsar", "220f", 2023, 145000.00));
		bike.add(new Bikes("Bullet", "220f", 2023, 145000.00));
		bike.add(new Bikes("NS200", "220f", 2023, 145000.00));

		System.err.println(bike);
	}

}
