package com.thread.example;


class Wish{
	public static synchronized void greeting(String name) {
		for(int i=0;i<=5;i++) {
			System.out.println("hai..."+name);
		}
		
		
	}
	
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		Wish.greeting(getName());
	}
}
public class ThreadEx2 {

	public static void main(String[] args) {
		MyThread2 m3=new MyThread2();
		m3.start();
	
	}

}
