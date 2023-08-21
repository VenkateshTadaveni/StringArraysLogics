package com.logics;


abstract class Venky{
	
	
   protected void instance() {
		System.out.println("instance method");
	}
   
   static {
	   System.out.println("static block");
   }
   
   {
	   System.out.println("instance block");
   }
   
	static void m(){
		System.out.println("static method");
	//	System.exit(0);
	}
}
public class Main extends Venky{
	
	
	

public static void main(String[] args) {
	
	System.out.println("main method");
	//Main.m();
	
	Main m=new Main();
	m.instance();
	
		
	//Venky v=new Main();
	Main.m();

	
}


}









