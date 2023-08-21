package com.sathya.examples;

@FunctionalInterface
interface Greetings{
	public void greet();
}

public class GreetingsEx1{
	public static void main(String[] args){
		Greetings g1=()-> System.out.println("Tadaveni Venkatesh is a developer");
		g1.greet();
	}
	
}
