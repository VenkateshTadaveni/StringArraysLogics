package com.sathya.deadlockex;

class Mythread extends Thread {

	Integer num1;
	Integer num2;

	public Mythread(Integer num1, Integer num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		synchronized (num1) {
			System.out.println("this is thread1");
			synchronized (num2) {
				System.out.println("this is num2");

			}
		}

	}
}


class Mythread2 extends Thread {
	Integer num1;
	Integer num2;

	public Mythread2(Integer num1, Integer num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		synchronized (num2) {
			System.out.println("this is num2 thread");
			synchronized (num1) {
				System.out.println("this is num1");
			}

		}
	}
}



public class Deadlock1 {

	public static void main(String[] args)throws NullPointerException,ClassNotFoundException {
		Mythread t1=new Mythread(10,20);
		t1.start();
		Mythread2 t2=new Mythread2(20,10);
		t2.start();

	}

}
