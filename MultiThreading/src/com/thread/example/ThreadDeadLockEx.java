package com.thread.example;

class MyThread4 extends Thread {

	Integer num1;
	Integer num2;

	MyThread4(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		synchronized (num1) {

			try {
				System.out.println("This is num1 Excution..");
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}

			synchronized (num2) {
				System.out.println("This is num2 Locked in num1");
			}
		}

	}

}

class MyThread5 extends Thread {
	Integer num1;
	Integer num2;

	MyThread5(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		synchronized (num2) {

			try {
				System.out.println("This is num2 Excution...");
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (num1) {
				System.out.println(num1 + num2 + "  adding");
			}
		}
	}

}

public class ThreadDeadLockEx {

	public static void main(String[] args) {
		MyThread4 t4 = new MyThread4(10, 20);
		t4.start();
		MyThread5 t5 = new MyThread5(10, 20);
		t5.start();

	}
}
