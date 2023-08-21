package com.sathya.threadSleep;

class SanthoshThread extends Thread {
	@Override
	public void run() {
		System.out.println("Good morning");
		System.out.println("Good Morning Hello");
		try {Thread.sleep(3000);} 
		catch (InterruptedException e) {

		}
	}
}

class Mythread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Good afternoon");
		System.out.println("Good afternoon Hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			{
				e.printStackTrace();
			}
		}

	}
}

class Mythread2 extends Thread {
	@Override
	public void run() {
		System.out.println("Good evening");
		System.out.println("Good evening hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class MyThread3 extends Thread {
	@Override
	public void run() {
		System.out.println("Good night");
		System.out.println("Good night hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			{
				e.printStackTrace();
			}

		}

	}
}


	public class RealTimeEx {

		public static void main(String[] args) throws InterruptedException{ 

			SanthoshThread t = new SanthoshThread();
			t.start();
			t.join();

			Mythread1 t1 = new Mythread1();
			t1.start();
			t1.join();

			Mythread2 t2 = new Mythread2();
			t2.start();
			t2.join();

			MyThread3 t3 = new MyThread3();
			t3.start();

		}

	}
