package com.multiThreadEx.DeadLockEx;

class Mythread extends Thread{
	String num1;
	String num2;
	
	public Mythread(String num1, String num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		
		synchronized (num1) {
			System.out.println("this is  a Thead1");
		
		}
	}
}










public class DeadLockEx1 {

	public static void main(String[] args) {
		
	}

}
