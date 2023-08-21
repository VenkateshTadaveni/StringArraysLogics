package com.sathya.multithreadex;

class Mythread extends Thread
{
	@Override
	public void run() {
		System.out.println("this is user thread");
	}
}

class MyServiceThread extends Thread
{
	@Override
	public void run() {
		System.out.println("this is second user thread..");
	} 
}

public class MultiThreadServices{
	

public static void main(String[] args) {
	Mythread t1=new Mythread();
	t1.start();
	MyServiceThread t2=new MyServiceThread();
	t2.start();
	
	System.out.println("this is main thread");
}
}