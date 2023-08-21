package com.thread.example;

public class ThreadEx4 extends Thread {

	@Override
	public void run() {

		System.out.println("Thread Priority  " + Thread.currentThread().getPriority());
		System.out.println("Thread Name  " + Thread.currentThread().getName());
		System.out.println("Thread id  " + Thread.currentThread().getClass());
	}

	public static void main(String[] args) {

		ThreadEx4 t1 = new ThreadEx4();
		t1.start();
		t1.setPriority(4);
		ThreadEx4 ex4 = new ThreadEx4();
		ex4.start();
		ex4.setPriority(MIN_PRIORITY);
		System.out.println("Main Thread Priority  "+Thread.currentThread().getPriority());
		System.out.println("Thread Name.."+Thread.currentThread().getName());
		System.out.println("Thread Class..."+Thread.currentThread().getClass());
		System.out.println("Thread ContexLoder  "+Thread.currentThread().getContextClassLoader());

	}

}
