package com.thread.example;


class A{
public	void show() {
		System.out.println("This is A show");
	}
}
class B extends A{
public void show() {
		System.out.println("this is B show");
	}
	
}



public class ThreadExample {
	

	public static void main(String[] args) {
		
		A a=new B();
		a.show();
		B b=new B();
		b.show();
		
	}

}
